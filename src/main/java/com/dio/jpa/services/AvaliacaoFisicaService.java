package com.dio.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.jpa.entity.Aluno;
import com.dio.jpa.entity.AvaliacaoFisica;
import com.dio.jpa.entity.DTO.AvaliacaoFisicaDto;
import com.dio.jpa.repositories.AlunoRepository;
import com.dio.jpa.repositories.AvaliacaoFisicaRepository;

@Service
public class AvaliacaoFisicaService {
	
	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRep;
	
	@Autowired
	private AlunoRepository alunoRep;
	
	public List<AvaliacaoFisica> getAll(){
		return null;
	}
	
	public AvaliacaoFisica create (AvaliacaoFisicaDto avaliacao) {
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		Aluno aluno = alunoRep.getById(avaliacao.getAlunoId());
		
		avaliacaoFisica.setAluno(aluno);
		avaliacaoFisica.setPeso(avaliacao.getPeso());
		avaliacaoFisica.setAltura(avaliacao.getAltura());
		
		return avaliacaoFisicaRep.save(avaliacaoFisica);
	}
	public AvaliacaoFisica getAvaliacao(Long id) {
		return null;
	}
	
}
