
package com.example.bootstrapper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

    @GetMapping("/")
    public String getAllSimpleLists() {
        // Implement logic to get all Simple Lists
        return "Collection of Simple Lists";
    }

    @GetMapping("/{list-id}")
    public String getSimpleList(@PathVariable("list-id") String listId) {
        // Implement logic to get a Simple List with id={listId}
        return "Simple List with id=" + listId;
    }

    @GetMapping("/{list-id}/items")
    public String getSimpleListItems(@PathVariable("list-id") String listId) {
        // Implement logic to get collection of Simple List Items of the Simple List with id={listId}
        return "Collection of Simple List Items of the Simple List with id=" + listId;
    }
}
