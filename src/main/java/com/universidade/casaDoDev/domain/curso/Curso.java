package com.universidade.casaDoDev.domain.curso;

import com.universidade.casaDoDev.domain.departamento.Departamento;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Entity

@NoArgsConstructor
@AllArgsConstructor

@Data
public class Curso{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codCurso;
    private String nomeCurso;
    @OneToMany
    private List<Departamento> departamento;

    public Curso(CursoRequestDTO cursoRequestDTO) {
        this.setNomeCurso(cursoRequestDTO.nomeCurso());
        this.setDepartamento(cursoRequestDTO.departamento());


    }
}
