package com.dio.jpa.entity.DTO;

public class AvaliacaoFisicaDto {
	
	private Long alunoId;
	
	private double peso;
	
	private double altura;

	public AvaliacaoFisicaDto(Long alunoId, double peso, double altura) {
		super();
		this.alunoId = alunoId;
		this.peso = peso;
		this.altura = altura;
	}

	public Long getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	

}
