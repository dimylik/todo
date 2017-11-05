package com.todo.loaders;

import com.todo.domain.Item;
import com.todo.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MockLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        if (!itemRepository.findAll().iterator().hasNext()) {
            List<String> mockItems = Arrays.asList(
                    "Christmas shopping",
                    "BBQ Saturday",
                    "Wife's birthday",
                    "Interview"
            );

            for (String item : mockItems) {
                itemRepository.save(new Item(item));
            }
        }

    }
}