
package com.example.bootstrapper.repository;

import cloud.solvo.worker.models.catalog.RichList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RichListRepository extends JpaRepository<RichList, Long> {
    // Additional query methods if needed
}
