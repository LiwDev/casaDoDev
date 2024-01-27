package com.universidade.casaDoDev.domain.departamento;

public record DepartamentoResponseDTO(int codDepartamento,String nomeDepartamento) {
    public DepartamentoResponseDTO(Departamento departamento) {
       this(departamento.getCodDepartamento(),departamento.getNomeDepartamento());
    }
}
