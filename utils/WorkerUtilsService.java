package cloud.solvo.worker.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WorkerUtilsService
{
    private final ObjectMapper objectMapper;

    public WorkerUtilsService(ObjectMapper objectMapper)
    {
        this.objectMapper = objectMapper;
    }

    public Map<String, Object> convertToMap(Object dto) {
        return objectMapper.convertValue(dto, new TypeReference<>(){});
    }

    public <T> T convertToDto(JsonNode jsonNode, Class<T> clazz) {
        return objectMapper.convertValue(jsonNode, clazz);
    }
}
