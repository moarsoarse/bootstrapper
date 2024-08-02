
package com.example.bootstrapper.service;

import com.example.bootstrapper.repository.DomainItemRepository;
import cloud.solvo.worker.models.domain.DomainItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainItemService {

    @Autowired
    private DomainItemRepository domainItemRepository;

    public List<DomainItem> getAllDomainItems() {
        return domainItemRepository.findAll();
    }

    public DomainItem getDomainItem(Long id) {
        return domainItemRepository.findById(id).orElse(null);
    }
}
