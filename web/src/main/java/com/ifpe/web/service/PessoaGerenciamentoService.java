package com.ifpe.web.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpe.web.repository.PessoaRepository;
import com.ifpe.web.entity.Pessoa;

@Service
public class PessoaGerenciamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EmailService emailService;

    public String solicitarCodigo(String email){

        Pessoa pessoa = pessoaRepository.findByEmail(email);
        pessoa.setCodigoRecuperacaoSenha(getCodigoRecuperacaoSenha(pessoa.getId()));
        pessoa.setDataEnvioCodigo(new Date());
        pessoaRepository.saveAndFlush(pessoa);
        emailService.enviarEmailTexto(pessoa.getEmail(), "Recuperação de senha", "Segue o código para recuperação de senha: " + pessoa.getCodigoRecuperacaoSenha());

        return "Codigo enviado!";

    }

    public String alterarSenha(Pessoa pessoa){

        Pessoa pessoaBanco = pessoaRepository.findByEmailAndCodigoRecuperacaoSenha(pessoa.getEmail(), pessoa.getCodigoRecuperacaoSenha());

    if (pessoaBanco != null){ 

        Date diferenca = new Date(new Date().getTime() - pessoaBanco.getDataEnvioCodigo().getTime());

        if(diferenca.getTime()/1000<900){
            pessoaBanco.setSenha(pessoa.getSenha());
            pessoaBanco.setCodigoRecuperacaoSenha(null);
            pessoaRepository.saveAndFlush(pessoaBanco);
            return "senha alterada com sucesso.";

        } else {
            return "Tempo expirado. Solicite um novo código";
        }
    } else {
        return "Email ou código não encontrado!";
    }   
}

    private String getCodigoRecuperacaoSenha(Long id){
        DateFormat format = new SimpleDateFormat("ddMMyyyyHHmmssmm");
        return format.format(new Date())+id;
    }
    
}
