package com.universidade.casaDoDev.domain.turma;

import com.universidade.casaDoDev.domain.curso.Curso;

import java.sql.Date;

public record TurmaResponseDTO( int codTurma,
                                Curso fkCodCurso,
                               String periodo,
                               int numAlunos,
                               Date dataInicio,
                               Date dataFim) {
    public TurmaResponseDTO(Turma turma) {
       this(turma.getCodTurma(), turma.getFkCodCurso(), turma.getPeriodo(), turma.getNumAlunos(), turma.getDataInicio(),turma.getDataFim()
       );
    }
}
