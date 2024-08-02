
package com.example.bootstrapper.repository;

import cloud.solvo.worker.models.list.SimpleList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleListRepository extends JpaRepository<SimpleList, Long> {
    // Additional query methods if needed
}
