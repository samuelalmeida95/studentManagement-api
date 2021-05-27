package com.samuel.crudalunos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //gerar get, set e construtor para os campos necessários
@NoArgsConstructor //gerar um construtor vazio
@AllArgsConstructor //gerar um construtor com argumentos

@Entity //a classe é uma entidade do banco jpa
public class Aluno implements Serializable{

   /*  private static final long serialVersionUID = 1L; */

    @Id //representa chave primaria da entidade no banco
    @GeneratedValue
    private Integer id;

    @NotEmpty(message = "campo NOME é obrigatorio")
    private String nome;

    @NotEmpty(message = "campo SENHA é obrigatorio")
    private String senha;
}
