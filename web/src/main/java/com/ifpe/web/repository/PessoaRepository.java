package com.ifpe.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.web.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

    Pessoa findByEmail(String email);

    Pessoa findByEmailAndCodigoRecuperacaoSenha(String email, String codigoRecuperacaoSenha);
}