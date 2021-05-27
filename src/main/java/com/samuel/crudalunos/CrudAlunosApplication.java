package com.samuel.crudalunos;

import java.util.Arrays;

import com.samuel.crudalunos.domain.Aluno;
import com.samuel.crudalunos.domain.Professor;
import com.samuel.crudalunos.repositories.AlunoRepository;
import com.samuel.crudalunos.repositories.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudAlunosApplication implements CommandLineRunner {

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private ProfessorRepository professorRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudAlunosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Aluno a1 = new Aluno(null, "Samuel Almeida", "1234");
		Aluno a2 = new Aluno(null, "Gabrielle Barbosa", "010203");


		alunoRepository.saveAll(Arrays.asList(a1, a2));

		Professor p1 = new Professor(null, "Loiane", "20210156", "java15");
		Professor p2 = new Professor(null, "Carlos", "20010186", "cobol+");
		Professor p3 = new Professor(null, "Mayke", "20180266", "Js2020");

		professorRepository.saveAll(Arrays.asList(p1, p2,p3));


	}

}
