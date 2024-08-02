
package com.example.bootstrapper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @GetMapping("/")
    public String getAllRichLists() {
        // Implement logic to get all Rich Lists
        return "Collection of Rich Lists";
    }

    @GetMapping("/{list-id}")
    public String getRichList(@PathVariable("list-id") String listId) {
        // Implement logic to get a Rich List with id={listId}
        return "Rich List with id=" + listId;
    }

    @GetMapping("/{list-id}/items")
    public String getRichListItems(@PathVariable("list-id") String listId) {
        // Implement logic to get collection of Rich List Items of the Rich List with id={listId}
        return "Collection of Rich List Items of the Rich List with id=" + listId;
    }

    @GetMapping("/{list-id}/schemas")
    public String getRichListMeta(@PathVariable("list-id") String listId) {
        // Implement logic to get collection of Rich List Meta of the Rich List with id={listId}
        return "Collection of Rich List Meta of the Rich List with id=" + listId;
    }

    @GetMapping("/item/{item-id}")
    public String getRichListItem(@PathVariable("item-id") String itemId) {
        // Implement logic to get a Rich List Item with id={itemId}
        return "Rich List Item with id=" + itemId;
    }

    @GetMapping("/{list-id}/{item-id}")
    public String getRichListItemFromList(@PathVariable("list-id") String listId, @PathVariable("item-id") String itemId) {
        // Implement logic to get a Rich List Item with id={itemId} from Rich List with id={listId}
        return "Rich List Item with id=" + itemId + " from Rich List with id=" + listId;
    }
}
