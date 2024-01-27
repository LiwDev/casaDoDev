package com.universidade.casaDoDev.repositories;

import com.universidade.casaDoDev.domain.departamento.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento,String> {
}
