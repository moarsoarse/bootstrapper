package cloud.solvo.worker.models.catalog;

import cloud.solvo.worker.models.domain.DomainMeta;
import cloud.solvo.worker.models.interfaces.Collectable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@MappedSuperclass
public class RichListMeta<C extends RichList> extends DomainMeta implements Collectable<C>
{

    @ManyToOne
    @JoinColumn(name = "collector_id", nullable = false)
    @Comment("Link to the list")
    private C collector;
}