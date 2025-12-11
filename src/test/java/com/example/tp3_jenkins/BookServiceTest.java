package com.example.tp3_jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Tp3JenkinsApplication.class)
public class BookServiceTest {
    @Autowired
    private BookService service;

    @Test
    void testCreateBook() {
        Book b = new Book();
        b.setTitle("Test Book");
        b.setAuthor("Author X");
        b.setGenre("Sci-Fi");

        Book saved = service.save(b);

        Assertions.assertNotNull(saved.getId());
    }
}

