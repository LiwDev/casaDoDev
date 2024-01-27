package com.universidade.casaDoDev.controller;

import com.universidade.casaDoDev.domain.aluno.AlunoResponseDTO;
import com.universidade.casaDoDev.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/casadodev/aluno")
public class AlunoController {
    @Autowired
    AlunoRepository repository;
    @GetMapping
    public ResponseEntity getAllAluno(){
        List<AlunoResponseDTO> alunoList = this.repository.findAll().stream().map(AlunoResponseDTO::new).toList();

        return ResponseEntity.ok(alunoList);
    }
}
