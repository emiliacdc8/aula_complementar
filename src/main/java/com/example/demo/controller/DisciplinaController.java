package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Disciplina;
import com.example.demo.repository.DisciplinaRepository;

@RestController
@RequestMapping(value="/disciplinas")
public class DisciplinaController {
	@Autowired
	private DisciplinaRepository repository;
	
	@GetMapping
	public List<Disciplina> listar() {
		List<Disciplina> list = repository.findAll();
		return list;
	}
	
	@GetMapping(value="/{id}")//para buscar uma disciplina pelo id
	public Disciplina listarUm(@PathVariable Integer id) {
		Optional<Disciplina> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
