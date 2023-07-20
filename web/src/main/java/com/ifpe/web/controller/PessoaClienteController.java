package com.ifpe.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifpe.web.dto.PessoaClienteRequestDTO;
import com.ifpe.web.entity.Pessoa;
import com.ifpe.web.service.PessoaClienteService;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin
public class PessoaClienteController {
    
    @Autowired
    private PessoaClienteService pessoaService;

    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO){
        return pessoaService.registrar(pessoaClienteRequestDTO);
    }

}