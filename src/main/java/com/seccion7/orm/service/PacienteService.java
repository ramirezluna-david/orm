package com.seccion7.orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion7.orm.model.Paciente;
import com.seccion7.orm.repository.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepostiory;
    public List<Paciente> findAll() {
        return pacienteRepostiory.findAll();
    }

    public Paciente save(Paciente paciente) {
        return pacienteRepostiory.save(paciente);
    }

    public Paciente findById(int id) {
        return pacienteRepostiory.findById(id);
    }
}
