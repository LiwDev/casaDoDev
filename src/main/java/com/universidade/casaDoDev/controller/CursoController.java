package com.universidade.casaDoDev.controller;

import com.universidade.casaDoDev.domain.aluno.AlunoResponseDTO;
import com.universidade.casaDoDev.domain.curso.CursoResponseDTO;
import com.universidade.casaDoDev.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/casadodev/curso")
public class CursoController {
    @Autowired
    CursoRepository cursoRepository;
    @GetMapping
    public ResponseEntity getAllCurso(){
        List<CursoResponseDTO> cursoList = this.cursoRepository.findAll().stream().map(CursoResponseDTO::new).toList();

        return ResponseEntity.ok(cursoList);
    }
}
