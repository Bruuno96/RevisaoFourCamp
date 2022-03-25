package br.com.revisao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {


    private String cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi;

}
