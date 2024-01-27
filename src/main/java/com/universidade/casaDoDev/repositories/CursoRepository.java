package com.universidade.casaDoDev.repositories;

import com.universidade.casaDoDev.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso,String> {
}
