package com.universidade.casaDoDev.controller;

import com.universidade.casaDoDev.domain.departamento.Departamento;
import com.universidade.casaDoDev.domain.departamento.DepartamentoResponseDTO;
import com.universidade.casaDoDev.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/casadodev/departamento")
public class DepartamentoController {
    @Autowired
    DepartamentoRepository departamentoRepository;
    @GetMapping
    public ResponseEntity<List<DepartamentoResponseDTO>> getAllDepartamento(){
        List<DepartamentoResponseDTO> departamentoList = this.departamentoRepository.findAll().stream().map(DepartamentoResponseDTO::new).toList();
        return ResponseEntity.ok(departamentoList);
    }
}
