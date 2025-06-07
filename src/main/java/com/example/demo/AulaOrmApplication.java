package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Disciplina;
import com.example.demo.repository.AlunoRepository;
import com.example.demo.repository.DisciplinaRepository;
import java.util.Arrays;

@SpringBootApplication
public class AulaOrmApplication implements CommandLineRunner{

    private final AlunoRepository alunoRepository;

    AulaOrmApplication(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

	public static void main(String[] args) {
		SpringApplication.run(AulaOrmApplication.class, args);
	}

	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Disciplina d1 = new Disciplina(null,"Programação Orientada a Objetos", 64);
		Disciplina d2 = new Disciplina(null,"Pesquisa Operacional", 64);
		Disciplina d3 = new Disciplina(null,"IA", 64);
		
		disciplinaRepository.saveAll(Arrays.asList(d1,d2,d3));
	}

}
