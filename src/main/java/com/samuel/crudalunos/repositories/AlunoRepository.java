package com.samuel.crudalunos.repositories;

import com.samuel.crudalunos.domain.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    
}
