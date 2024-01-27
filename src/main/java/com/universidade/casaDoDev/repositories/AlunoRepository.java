package com.universidade.casaDoDev.repositories;

import com.universidade.casaDoDev.domain.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,String> {
}
