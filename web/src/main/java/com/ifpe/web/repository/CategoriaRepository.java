package com.ifpe.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.web.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
