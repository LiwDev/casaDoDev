package com.universidade.casaDoDev.domain.turma;

import com.universidade.casaDoDev.domain.curso.Curso;

import java.sql.Date;

public record TurmaRequestDTO(
        Curso fkCodCurso,
        String periodo,
         int numAlunos,
         Date dataInicio,
         Date dataFim) {
}
