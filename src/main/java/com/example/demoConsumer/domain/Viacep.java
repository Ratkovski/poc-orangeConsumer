package com.example.demoConsumer.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Viacep {

//    {
//        "cep": "01001-000",
//            "logradouro": "Praça da Sé",
//            "complemento": "lado ímpar",
//            "bairro": "Sé",
//            "localidade": "São Paulo",
//            "uf": "SP",
//            "ibge": "3550308",
//            "gia": "1004",
//            "ddd": "11",
//            "siafi": "7107"
//    }
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
