package com.ifpe.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.web.entity.Permissao;
import java.util.List;


public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
    
    List<Permissao> findByNome(String nome);

}
