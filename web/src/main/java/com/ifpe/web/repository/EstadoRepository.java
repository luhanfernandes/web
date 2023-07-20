package com.ifpe.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.web.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
    
}