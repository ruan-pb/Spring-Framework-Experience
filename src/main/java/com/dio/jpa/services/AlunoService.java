package com.dio.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.jpa.entity.Aluno;
import com.dio.jpa.entity.AvaliacaoFisica;
import com.dio.jpa.entity.DTO.AlunoDto;
import com.dio.jpa.entity.DTO.AlunoUpdateDto;
import com.dio.jpa.repositories.AlunoRepository;
import com.dio.jpa.services.interfaces.AlunoMethods;

@Service
public class AlunoService implements AlunoMethods{
	
	@Autowired
	private AlunoRepository alunoRep;

	@Override
	public void delele(Long id) {
		alunoRep.deleteById(id);;
	}


	@Override
	public Aluno createAluno(AlunoDto aluno) {
		Aluno alunoNovo = new Aluno();
		
		alunoNovo.setNome(aluno.getNome());
		alunoNovo.setBairro(aluno.getBairro());
		alunoNovo.setDataDeNascimento(aluno.getDataDeNascimento());
		alunoNovo.setCpf(aluno.getCpf());
		
		return alunoRep.save(alunoNovo);
		
	}

	@Override
	public List<Aluno> getAll() {
		return alunoRep.findAll();
	}
	
	public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
		
		Aluno aluno = alunoRep.getById(id);
		
		return aluno.getAvaliacoes();
	}

	@Override
	public Aluno update(Long id, AlunoUpdateDto aluno) {
		Optional<Aluno> alunoUpdate = alunoRep.findById(id);
		if(alunoUpdate.isPresent()) {
			alunoUpdate.get().setBairro(aluno.getNome());
			alunoUpdate.get().setCpf(aluno.getNome());
			alunoUpdate.get().setDataDeNascimento(aluno.getDataDeNascimento());
			alunoUpdate.get().setNome(aluno.getNome());
		}
		return alunoUpdate.get();
	}


	@Override
	public Aluno getAluno(Long id) {
		return null;
	}


}
