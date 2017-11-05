package com.todo.repositories;

import com.todo.domain.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ItemRepository extends CrudRepository<Item, String> {

    Item save(Item item);

    Item findOne(String id);

    Collection<Item> findAll();

    void delete(String id);

}
