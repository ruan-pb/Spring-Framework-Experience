package com.dio.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Matricula {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Aluno aluno;
	private LocalDateTime dataDaMatricula = LocalDateTime.now();
	
	
	
	public Matricula(Long id, Aluno aluno) {
		super();
		this.id = id;
		this.aluno = aluno;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Aluno getAluno() {
		return aluno;
	}



	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}



	public LocalDateTime getDataDaMatricula() {
		return dataDaMatricula;
	}



	public void setDataDaMatricula(LocalDateTime dataDaMatricula) {
		this.dataDaMatricula = dataDaMatricula;
	}
	
	
	
	
	

}
