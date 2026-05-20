package com.spring.security.services;

import com.spring.security.models.PessoaModel;
import com.spring.security.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll(){
        return  pessoaRepository.findAll();
    }

    public Optional<PessoaModel> findById(Long id) {
        return pessoaRepository.findById(id);
    }

    public PessoaModel criarPessoa(PessoaModel pessoaModel){
        return  pessoaRepository.save(pessoaModel);
    }

}