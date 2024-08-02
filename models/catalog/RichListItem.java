package cloud.solvo.worker.models.catalog;

import cloud.solvo.worker.models.interfaces.Body;
import cloud.solvo.worker.models.list.SimpleListItem;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.databind.JsonNode;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;


@Getter
@Setter
@MappedSuperclass
public class RichListItem<C extends RichList> extends SimpleListItem<C> implements Body
{
    @JsonSubTypes.Type(value = JsonBinaryType.class)
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private JsonNode data;

    @Override
    public JsonNode getBody() {
        return data;
    }
}