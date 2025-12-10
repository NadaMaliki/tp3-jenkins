package com.example.tp3_jenkins;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tp3_jenkins.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
