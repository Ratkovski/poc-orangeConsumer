package com.example.demoConsumer.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class Viacep implements Serializable {

    private static final long serialVersionUID = 7536379133171483585L;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;


}
