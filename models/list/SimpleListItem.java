package cloud.solvo.worker.models.list;

import cloud.solvo.worker.models.base.AbstractNamed;
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
public class SimpleListItem<L extends SimpleList> extends AbstractNamed implements Collectable<L>
{
    @ManyToOne
    @JoinColumn(name = "collector_id", nullable = false)
    @Comment("Link to the list")
    private L collector;

    @Override
    public L getCollector() {
        return collector;
    }
}