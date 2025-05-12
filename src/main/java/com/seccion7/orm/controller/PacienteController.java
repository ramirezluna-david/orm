package com.seccion7.orm.controller;

import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
@RestController
public class PacienteController {

=======
import com.seccion7.orm.model.Paciente;
import com.seccion7.orm.service.PacienteService;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<Paciente>> getAll() {
        List<Paciente> pacientes = pacienteService.findAll();
        if(!pacientes.isEmpty()) {
            return new ResponseEntity<>(pacientes, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping
    public ResponseEntity<Paciente> postPaciente(@RequestBody Paciente paciente) {
        Paciente buscado = pacienteService.findById(paciente.getId());
        if(buscado == null) {
            return new ResponseEntity<>(pacienteService.save(paciente), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> getById(@RequestParam int id) {
        return new ResponseEntity<Paciente>(pacienteService.findById(id), HttpStatus.OK);
    }
>>>>>>> miRama_seccion7ORM
}
