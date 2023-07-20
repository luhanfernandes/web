package com.ifpe.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.web.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    
}
