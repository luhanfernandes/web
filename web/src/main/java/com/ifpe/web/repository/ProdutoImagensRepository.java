package com.ifpe.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.web.entity.ProdutoImagens;

public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens, Long> {

    public List <ProdutoImagens> findByProdutoId(Long id);
    
}
