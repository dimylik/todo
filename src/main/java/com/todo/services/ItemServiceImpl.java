package com.todo.services;

import com.todo.domain.Item;
import com.todo.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item createItem(String value) {
        return itemRepository.save(new Item(value));
    }

    @Override
    public void deleteItem(String id) {
        Item item = itemRepository.findOne(id);
        if (item != null) {
            itemRepository.delete(id);
        }
    }

    @Override
    public Item changeItemStatus(String id) {
        Item item = itemRepository.findOne(id);
        if (item != null) {
            item.switchStatus();
            return itemRepository.save(item);
        }
        return null;
    }

    @Override
    public Collection<Item> getAllItems() {
        return (Collection<Item>) itemRepository.findAll();
    }

}
