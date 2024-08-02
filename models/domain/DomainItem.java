package cloud.solvo.worker.models.domain;

import cloud.solvo.worker.models.base.AbstractBodied;
import cloud.solvo.worker.models.interfaces.Displayable;
import cloud.solvo.worker.models.interfaces.Importable;
import cloud.solvo.worker.models.interfaces.Procedural;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.databind.JsonNode;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import cloud.solvo.worker.utils.SourcePointer;

import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class DomainItem<C extends DomainMeta> extends AbstractBodied implements Displayable, Procedural, Importable
{
    @JsonSubTypes.Type(value = JsonBinaryType.class)
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private JsonNode data;

    @Column
    @Comment("String used as a title")
    private String displayString;

    @ManyToOne
    @JoinColumn(name = "schema_id", nullable = false)
    @Comment("Link to corresponding schema")
    private C schema;

    @Column
    @Comment("Current status id")
    private UUID status;

    @Column
    @Comment("Associated process instance id")
    private String process;

    @Embedded
    private SourcePointer sourcePointer;

    @Override
    public JsonNode getBody() {
        return data;
    }

    public C getMeta() {
        return schema;
    }
}