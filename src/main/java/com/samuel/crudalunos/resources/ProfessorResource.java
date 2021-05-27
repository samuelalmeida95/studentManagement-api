package com.samuel.crudalunos.resources;

import java.net.URI;
import java.util.List;

import com.samuel.crudalunos.domain.Professor;
import com.samuel.crudalunos.services.ProfessorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/professores")
public class ProfessorResource {

    @Autowired
    private ProfessorService service;

    @GetMapping(value = "/{id}") //listar por id
    public ResponseEntity<Professor> findById(@PathVariable Integer id) {
        Professor obj = this.service.findById(id);
        return ResponseEntity.ok().body(obj);
    } 
    
    @GetMapping //listar todos
    public ResponseEntity<List<Professor>> findAll() {
        List<Professor> professores = this.service.findAll();
        return ResponseEntity.ok().body(professores);
    }

    @PostMapping //Adicionar um professor
    public ResponseEntity<Professor> create (@RequestBody Professor professor){
        Professor newProf = service.create(professor);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newProf.getId())
                .toUri();
                return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}") //alterar por id 
    public ResponseEntity<Professor> update (@PathVariable Integer id, @RequestBody Professor professor){
        Professor newProf = service.update(id, professor);
        return ResponseEntity.ok().body(newProf);
    }

    @DeleteMapping(value = "/{id}") //deletar por id
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}   
