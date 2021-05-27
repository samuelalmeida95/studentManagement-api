package com.samuel.crudalunos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Entity 
public class Aluno implements Serializable{

    private static final long serialVersionUID = 1L; 

    @Id 
    @GeneratedValue
    private Integer id;

    @NotEmpty(message = "campo NOME é obrigatorio")
    private String nome;

    @NotEmpty(message = "campo SENHA é obrigatorio")
    private String senha;
}
