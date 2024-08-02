package cloud.solvo.worker.models.base;

import cloud.solvo.worker.models.interfaces.Displayable;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractNamed extends AbstractAuditable implements Displayable
{
    @Column(name = "title")
    @Comment("String used as a title")
    private String title;
}
