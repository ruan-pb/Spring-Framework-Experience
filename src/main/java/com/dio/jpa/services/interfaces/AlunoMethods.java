package com.dio.jpa.services.interfaces;

import java.util.List;

import com.dio.jpa.entity.Aluno;
import com.dio.jpa.entity.DTO.AlunoDto;
import com.dio.jpa.entity.DTO.AlunoUpdateDto;

public interface AlunoMethods {
	
	public void delele(Long id);
	
	public Aluno getAluno(Long id);
	
	public Aluno createAluno(AlunoDto aluno);
	
	public List<Aluno> getAll();
	
	public Aluno update(Long id, AlunoUpdateDto aluno ) ;

}
