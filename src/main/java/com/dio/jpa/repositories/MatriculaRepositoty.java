package com.dio.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.jpa.entity.Aluno;

public interface MatriculaRepositoty extends JpaRepository<Long, Aluno>{

}
