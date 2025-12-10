package com.example.tp3_jenkins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public List<Book> findAll() {
        return repo.findAll();
    }

    public Book save(Book b) {
        return repo.save(b);
    }
}

