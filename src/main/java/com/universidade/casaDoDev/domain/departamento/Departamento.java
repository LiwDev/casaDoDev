package com.universidade.casaDoDev.domain.departamento;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@NoArgsConstructor
@AllArgsConstructor

@Data
public class Departamento  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private    int codDepartamento;
private String nomeDepartamento;

}
