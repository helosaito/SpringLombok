package com.spring.security.controllers;

import com.spring.security.models.PessoaModel;
import com.spring.security.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> findAll() {
        return pessoaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaModel> findById(@PathVariable Long id) {
        return pessoaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public PessoaModel criarPessoa(@RequestBody PessoaModel pessoaModel) {
        return pessoaService.criarPessoa(pessoaModel);
    }
}
