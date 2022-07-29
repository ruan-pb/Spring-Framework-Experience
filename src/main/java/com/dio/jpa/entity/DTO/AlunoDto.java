package com.dio.jpa.entity.DTO;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlunoDto {
	
	@Size(min = 3, max = 50, message = "'${validatedValue}' Precisa estar dentro {min} e {max} de caracteres")
	@NotBlank(message = "Preenche o campo correspondente")
	private String nome;
	
	@CPF(message = "'${validatedValue}' é inválido")
	@NotBlank(message = "Preencha o campo correspondente")
	private String cpf;
	
	@NotBlank(message = "Preenche o campo correspondente")
	@Size(min = 3, max = 50, message = "'${validatedValue}' Precisa estar dentro {min} e {max} de caracteres")
	private String bairro;
	
	@NotBlank(message = "Preenche o campo correspondente")
	@Past(message = " data '${validatedValue}' é invalida")
	private LocalDate dataDeNascimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	
	
}
