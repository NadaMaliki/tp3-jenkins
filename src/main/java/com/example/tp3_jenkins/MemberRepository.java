package com.example.tp3_jenkins;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
