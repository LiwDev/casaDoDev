package com.universidade.casaDoDev.domain.aluno;

import com.universidade.casaDoDev.domain.curso.Curso;
import com.universidade.casaDoDev.domain.turma.Turma;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int ra;
private String nomeAluno;
private String SobrenomeAluno;
private String cpf;
private boolean statusAluno;

private String sexo;
    @OneToMany
   private List<Curso> fkCodCurso;
    @OneToMany
    private List<Turma> fkCodTurma;
private String nomePai;
private String NomeMae;
private String email;
private String whatsapp;

    public Aluno(AlunoRequestDTO alunoRequestDTO) {
 this.setNomeAluno(alunoRequestDTO.nomeAluno());
        this.setSobrenomeAluno( alunoRequestDTO.sobrenomeAluno());
        this.setCpf(alunoRequestDTO.cpf());
        this.setStatusAluno(alunoRequestDTO.status());
        this.setFkCodTurma( alunoRequestDTO.fkCodTurma());
        this.setSexo(alunoRequestDTO.sexo());
        this.setFkCodCurso(alunoRequestDTO.fkCodCurso());
        this.setNomePai(alunoRequestDTO.nomePai());
       this.setNomeMae(alunoRequestDTO.nomeMae());
        this.setEmail( alunoRequestDTO.email());
        this.setWhatsapp(alunoRequestDTO.whatsapp());
    }
}
