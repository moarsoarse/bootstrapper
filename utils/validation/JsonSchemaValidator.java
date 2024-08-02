package cloud.solvo.worker.utils.validation;

import com.fasterxml.jackson.databind.JsonNode;
import com.networknt.schema.*;
import org.springframework.stereotype.Component;

import java.util.Set;

//TODO добавить валидацию UUID в самом JSON, скорее всего придется делать вызовы и внедрять зависимости, потому - @Component
@Component
public class JsonSchemaValidator
{
    public ValidationResult validateJson(JsonNode jsonNode, JsonNode schemaNode)
    {
        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012);

        SchemaValidatorsConfig.Builder builder = SchemaValidatorsConfig.builder();

        //TODO добавить валидацию связанных сущностей в builder, но только для JSON, для схемы - не нужно
        SchemaValidatorsConfig config = builder.build();

        //TODO schemaNode.asText() - что то не так с преобразованием, возможно связано с экранированием
        JsonSchema schema = factory.getSchema(schemaNode.asText(), config);

        Set<ValidationMessage> validationResult = schema.validate(jsonNode.asText(), InputFormat.JSON, executionContext ->
                executionContext.getExecutionConfig().setFormatAssertionsEnabled(true)
        );

        return new ValidationResult(validationResult.isEmpty(), validationResult);
    }

    public ValidationResult validateSchema(JsonNode schemaNode)
    {
        JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012);

        SchemaValidatorsConfig.Builder builder = SchemaValidatorsConfig.builder();
        SchemaValidatorsConfig config = builder.build();
        JsonSchema schema = jsonSchemaFactory.getSchema(SchemaLocation.of(SchemaId.V202012), config);
        Set<ValidationMessage> validationMessages = schema.validate(schemaNode.asText(), InputFormat.JSON, executionContext ->
                executionContext.getExecutionConfig().setFormatAssertionsEnabled(true));

        return new ValidationResult(validationMessages.isEmpty(), validationMessages);

    }

    public record ValidationResult(boolean valid, Set<ValidationMessage> validationMessages){}
}
