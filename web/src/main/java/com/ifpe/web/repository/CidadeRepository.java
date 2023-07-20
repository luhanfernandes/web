package com.ifpe.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.web.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    
}
