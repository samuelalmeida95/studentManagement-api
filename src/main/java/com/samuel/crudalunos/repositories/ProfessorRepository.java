package com.samuel.crudalunos.repositories;

import com.samuel.crudalunos.domain.Professor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    
}
