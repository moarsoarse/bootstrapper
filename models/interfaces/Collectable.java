package cloud.solvo.worker.models.interfaces;

import cloud.solvo.worker.models.list.SimpleList;

public interface Collectable<L extends SimpleList> {
    L getCollector();
}
