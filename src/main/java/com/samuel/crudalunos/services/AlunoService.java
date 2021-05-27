package com.samuel.crudalunos.services;

import java.util.List;
import java.util.Optional;

import com.samuel.crudalunos.domain.Aluno;
import com.samuel.crudalunos.exceptions.ObjectNotFoundException;
import com.samuel.crudalunos.repositories.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public Aluno findById(Integer id) {
        Optional<Aluno> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado Id: " + id + " Tipo: " + Aluno.class.getName()));
    }

    public List<Aluno> findAll() {
        return this.repository.findAll();
    }

    public Aluno update(Integer id, Aluno obj) {
        Aluno novoAluno = findById(id);
        novoAluno.setNome(obj.getNome());
        novoAluno.setSenha(obj.getSenha());
        return repository.save(novoAluno);
    }

    public Aluno create(Aluno aluno) {
        aluno.setId(null);
        return repository.save(aluno);
    }

    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }
}
