package cloud.solvo.worker.models.list;

import cloud.solvo.worker.models.base.AbstractNamed;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class SimpleList extends AbstractNamed
{
}