package com.dio.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.jpa.entity.Aluno;
import com.dio.jpa.entity.AvaliacaoFisica;
import com.dio.jpa.entity.DTO.AlunoDto;
import com.dio.jpa.services.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<Aluno> getAll(){
		return alunoService.getAll();
	}
	
	@PostMapping
	public Aluno create (@RequestBody AlunoDto aluno) {
		return alunoService.createAluno(aluno);
	}
	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id){
		return alunoService.getAllAvaliacaoFisica(id);
	}
	
	
}
