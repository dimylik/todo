package com.todo.controllers;

import com.todo.domain.Item;
import com.todo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    @ResponseBody
    public Collection<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PutMapping("/items")
    @ResponseBody
    public Item createItem(@RequestBody String value) {
        return itemService.createItem(value);
    }

    @DeleteMapping("/items/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteItem(@PathVariable String id) {
        itemService.deleteItem(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/items/{id}")
    @ResponseBody
    public Item changeItemStatus(@PathVariable String id) {
        return itemService.changeItemStatus(id);
    }


}
