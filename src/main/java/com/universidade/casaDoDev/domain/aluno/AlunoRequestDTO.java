package com.universidade.casaDoDev.domain.aluno;

import com.universidade.casaDoDev.domain.curso.Curso;
import com.universidade.casaDoDev.domain.turma.Turma;

import java.util.List;


public record AlunoRequestDTO(

        String nomeAluno,
         String sobrenomeAluno,
         String cpf,
         boolean status,

         String sexo,

         List<Curso> fkCodCurso,
        List<Turma> fkCodTurma,
         String nomePai,
         String nomeMae,
         String email,
         String whatsapp) {
}
