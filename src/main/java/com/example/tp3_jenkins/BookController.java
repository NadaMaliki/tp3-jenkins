package com.example.tp3_jenkins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return service.save(book);
    }
}

