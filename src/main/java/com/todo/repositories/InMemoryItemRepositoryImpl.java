package com.todo.repositories;

import com.todo.domain.Item;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class InMemoryItemRepositoryImpl implements ItemRepository {

    private static Map<String, Item> mockData = new LinkedHashMap<>();

    @Override
    public Item create(String value) {
        String id = UUID.randomUUID().toString();
        mockData.put(id, new Item(id, value));
        return mockData.get(id);
    }

    @Override
    public Item save(Item item) {
        String id = item.getId();
        mockData.put(id, item);
        return mockData.get(id);
    }

    @Override
    public Item findOne(String id) {
        return mockData.get(id);
    }

    @Override
    public Collection<Item> findAll() {
        return mockData.values();
    }

    @Override
    public void delete(String id) {
        mockData.remove(id);
    }


}
