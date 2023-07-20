package com.ifpe.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.web.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
