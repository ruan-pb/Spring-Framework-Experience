package com.dio.jpa.entity.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MatriculaDto {
	
	@NotNull(message = "Preencha o campo correspondente")
	@Positive(message = "O id do aluno precisar ser positivo")
	private Long alunoId;

	public MatriculaDto(Long alunoId) {
		super();
		this.alunoId = alunoId;
	}

	public Long getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}
	
	

}
