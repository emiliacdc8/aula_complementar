package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Aluno;
import com.example.demo.model.Disciplina;
import com.example.demo.repository.AlunoRepository;
import com.example.demo.repository.DisciplinaRepository;
import java.util.Arrays;

@SpringBootApplication
public class AulaOrmApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(AulaOrmApplication.class, args);
	}

	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Disciplina d1 = new Disciplina(null,"Programação Orientada a Objetos", 64);
		Disciplina d2 = new Disciplina(null,"Pesquisa Operacional", 64);
		Disciplina d3 = new Disciplina(null,"IA", 64);
		
		Aluno a1 = new Aluno(null, "Maria Alves", "mariaalves@gmail.com", "123", "CDC");
		Aluno a2 = new Aluno(null, "Pedro Moraes", "pedromoraes@gmail.com", "546", "CDC");
		Aluno a3 = new Aluno(null, "Walter Silva", "waltersilva@gmail.com", "789", "CDC");
		Aluno a4 = new Aluno(null, "Marcos Andrade", "marcosandrade@gmail.com", "1012", "CDC");
		Aluno a5 = new Aluno(null, "Gustavo Oliveira", "gustavooliveira@gmail.com", "1234", "CDC");
		
		alunoRepository.saveAll(Arrays.asList(a1,a2,a3,a4,a5));
		disciplinaRepository.saveAll(Arrays.asList(d1,d2,d3));
	}

}
