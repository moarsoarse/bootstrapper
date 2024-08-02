
package com.example.bootstrapper.repository;

import cloud.solvo.worker.models.domain.DomainItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainItemRepository extends JpaRepository<DomainItem, Long> {
    // Additional query methods if needed
}
