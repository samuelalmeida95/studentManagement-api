package com.samuel.crudalunos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Professor implements Serializable{
    
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;

    private String siape;
    private String senha;
}
