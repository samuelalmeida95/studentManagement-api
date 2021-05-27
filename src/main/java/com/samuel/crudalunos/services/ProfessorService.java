package com.samuel.crudalunos.services;

import java.util.List;
import java.util.Optional;

import com.samuel.crudalunos.domain.Professor;
import com.samuel.crudalunos.exceptions.ObjectNotFoundException;
import com.samuel.crudalunos.repositories.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public Professor findById(Integer id) {
        Optional<Professor> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado Id: " + id + " Tipo: " + Professor.class.getName()));

    }

    public List<Professor> findAll() {
        return repository.findAll();
    }

    public Professor create(Professor professor) {
        professor.setId(null);
        return repository.save(professor);
    }

    public Professor update(Integer id, Professor prof) {
        Professor professor = findById(id);
        professor.setNome(prof.getNome());
        professor.setSenha(prof.getSenha());
        return repository.save(professor);
    }

    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }
}