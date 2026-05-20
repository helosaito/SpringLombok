package com.spring.security.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "TBL_PESSOAS")
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("cliente")
    private String nome;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonProperty("products")
    private List<JobModel> jobModelList;

}
