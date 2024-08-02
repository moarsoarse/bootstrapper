package cloud.solvo.worker.models.catalog;

import cloud.solvo.worker.models.list.SimpleList;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class RichList extends SimpleList
{
}