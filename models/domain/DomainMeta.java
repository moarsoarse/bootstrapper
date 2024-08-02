package cloud.solvo.worker.models.domain;

import cloud.solvo.worker.models.base.AbstractBodied;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.databind.JsonNode;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import cloud.solvo.worker.utils.Life;


@Getter
@Setter
@MappedSuperclass
public abstract class DomainMeta extends AbstractBodied
{
    @JsonSubTypes.Type(value = JsonBinaryType.class)
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private JsonNode schema;

    @Embedded
    private Life life;

    @Override
    public JsonNode getBody() {
        return schema;
    }
}