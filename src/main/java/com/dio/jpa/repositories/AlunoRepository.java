package com.dio.jpa.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.jpa.entity.Aluno;
import com.dio.jpa.entity.Matricula;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	public List<Matricula> findByAlunoBairro(String bairro);
	public List<Aluno> findByAlunoDataDeNascimento(LocalDate data);

	public List<Aluno> findAll();

}
