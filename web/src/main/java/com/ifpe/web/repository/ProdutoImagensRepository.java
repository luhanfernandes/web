package com.ifpe.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.web.entity.ProdutoImagens;

public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens, Long> {
    
}
