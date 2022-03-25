package com.bruno.webclient.controller;

import br.com.revisao.entities.Endereco;
import com.bruno.webclient.service.ServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EnderecoController {

    @Autowired
    private ServiceAPI serviceAPI;


    @GetMapping("/meucep/{cep}")
    public ResponseEntity<Endereco> getEndereco(@PathVariable String cep){
        System.out.println("entrei");
        Endereco enderecoData = serviceAPI.getEnderecoData(cep);
        return ResponseEntity.ok(enderecoData);
    }

}
