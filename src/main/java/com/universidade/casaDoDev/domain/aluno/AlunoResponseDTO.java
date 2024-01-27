package com.universidade.casaDoDev.domain.aluno;

import com.universidade.casaDoDev.domain.curso.Curso;
import com.universidade.casaDoDev.domain.turma.Turma;

import java.util.List;

public record AlunoResponseDTO(
        int ra,
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
    public AlunoResponseDTO(Aluno aluno) {

       this(aluno.getRa(),aluno.getNomeAluno(),
               aluno.getSobrenomeAluno(),
               aluno.getCpf(),
               aluno.isStatusAluno(),

               aluno.getSexo(),
               aluno.getFkCodCurso(),
               aluno.getFkCodTurma(),
               aluno.getNomePai(),
               aluno.getNomeMae(),
               aluno.getEmail(),
               aluno.getWhatsapp() );
    }
}
