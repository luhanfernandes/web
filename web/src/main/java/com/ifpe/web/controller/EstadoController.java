package com.ifpe.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifpe.web.entity.Estado;
import com.ifpe.web.service.EstadoService;

@RestController
@RequestMapping("/api/estado")
@CrossOrigin
public class EstadoController {
    
    @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    @CrossOrigin("http://localhost:3000")
    public List<Estado> buscarTodos(){
       return estadoService.buscarTodos();
    }

    @PostMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Estado inserir(@RequestBody Estado estado){
        return estadoService.inserir(estado);
    }

    @PutMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Estado alterar(@RequestBody Estado estado){
        return estadoService.alterar(estado);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin("http://localhost:3000")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        estadoService.excluir(id);
        return ResponseEntity.ok().build();
    }

}