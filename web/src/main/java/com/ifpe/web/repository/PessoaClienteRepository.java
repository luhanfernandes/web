package com.ifpe.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.web.entity.Pessoa;

public interface PessoaClienteRepository extends JpaRepository<Pessoa, Long> {
    
}
