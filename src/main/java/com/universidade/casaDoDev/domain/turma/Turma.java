package com.universidade.casaDoDev.domain.turma;

import com.universidade.casaDoDev.domain.curso.Curso;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int codTurma;

    private String periodo;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int numAlunos;
    private Date dataInicio;
    private Date dataFim;


    @ManyToOne
    private Curso fkCodCurso;

    public Turma(TurmaRequestDTO turmaRequestDTO) {
       this.setFkCodCurso(turmaRequestDTO.fkCodCurso());
       this.setPeriodo(turmaRequestDTO.periodo() );
       this.setNumAlunos(turmaRequestDTO.numAlunos());
       this.setDataInicio(turmaRequestDTO.dataInicio());
       this.setDataFim(turmaRequestDTO.dataFim());
    }
}
