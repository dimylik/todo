package com.todo.repositories;

import com.todo.domain.Item;

import java.util.Collection;

public interface ItemRepository {

    Item create(String value);

    Item save(Item item);

    Item findOne(String id);

    Collection<Item> findAll();

    void delete(String id);

}
