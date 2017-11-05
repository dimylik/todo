package com.todo.services;

import com.todo.domain.Item;

import java.util.Collection;

public interface ItemService {

    Item createItem(String value);

    void deleteItem(String id);

    Item changeItemStatus(String id);

    Collection<Item> getAllItems();

}
