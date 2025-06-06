package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table(name="ALUNOS")
public class Aluno extends Pessoa{
	@Column(nullable = false, unique = true)//não pode ser vazio e tem de ser unico
	private String matricula;
	@Column(nullable = false)
	private String curso;
	
	public Aluno(Integer id, String nome, String email, String matricula, String curso) {
		super(id, curso, curso);
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + "]";
	}
}
