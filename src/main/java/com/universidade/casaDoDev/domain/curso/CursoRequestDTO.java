package com.universidade.casaDoDev.domain.curso;

import com.universidade.casaDoDev.domain.departamento.Departamento;

import java.util.List;

public record CursoRequestDTO(
        String nomeCurso,
        List<Departamento> departamento

) {
}
