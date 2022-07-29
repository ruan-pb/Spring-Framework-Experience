package com.dio.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.jpa.entity.Aluno;
import com.dio.jpa.entity.AvaliacaoFisica;

public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long>{

}
