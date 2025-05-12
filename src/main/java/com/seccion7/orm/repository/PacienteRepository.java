package com.seccion7.orm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seccion7.orm.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
    List<Paciente> findAll();

    @SuppressWarnings("unchecked")
    Paciente save(Paciente paciente);

    Paciente findById(int id);
}
