
package com.example.bootstrapper.service;

import com.example.bootstrapper.repository.SimpleListRepository;
import cloud.solvo.worker.models.list.SimpleList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleListService {

    @Autowired
    private SimpleListRepository simpleListRepository;

    public List<SimpleList> getAllSimpleLists() {
        return simpleListRepository.findAll();
    }

    public SimpleList getSimpleList(Long id) {
        return simpleListRepository.findById(id).orElse(null);
    }

    public List<SimpleList> getSimpleListItems(Long listId) {
        // Implement logic to get Simple List Items
        return null;
    }
}
