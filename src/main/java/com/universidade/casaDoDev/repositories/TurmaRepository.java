package com.universidade.casaDoDev.repositories;

import com.universidade.casaDoDev.domain.turma.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<Turma,String> {
}
