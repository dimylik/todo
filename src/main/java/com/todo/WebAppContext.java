package com.todo;

import com.todo.repositories.InMemoryItemRepositoryImpl;
import com.todo.repositories.ItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan("com.todo")
public class WebAppContext extends SpringBootServletInitializer {

    @Bean
    public ItemRepository itemRepository() {
        return new InMemoryItemRepositoryImpl();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebAppContext.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebAppContext.class, args);
    }
}
