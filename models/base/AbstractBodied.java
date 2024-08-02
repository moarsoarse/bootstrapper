package cloud.solvo.worker.models.base;


import cloud.solvo.worker.models.interfaces.Body;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractBodied extends AbstractAuditable implements Body
{
}
