package com.universidade.casaDoDev.domain.curso;

import com.universidade.casaDoDev.domain.departamento.Departamento;

import java.util.List;

public record CursoResponseDTO(
        int codCurso, String nomeCurso,
                               List<Departamento> departamento) {
    public CursoResponseDTO(Curso curso) {
       this( curso.getCodCurso(),
       curso.getNomeCurso(),
       curso.getDepartamento());
    }
}
