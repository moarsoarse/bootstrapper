package cloud.solvo.worker.utils;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
public class SourcePointer implements Serializable
{
    @Column(name = "source_id")
    @Comment("Identifier of source system or services")
    private UUID source;

    @Column(name = "native_id")
    @Comment("Entry''s identifier at source")
    private String sourceId;
}
