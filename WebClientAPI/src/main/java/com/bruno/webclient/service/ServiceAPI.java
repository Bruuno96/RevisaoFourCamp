package com.bruno.webclient.service;

import br.com.revisao.entities.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ServiceAPI {

        @Autowired
        protected WebClient webClient;

        public Endereco getEnderecoData(String cep){

                Mono<Endereco> enderecoMono = this.webClient
                        .method(HttpMethod.GET)
                        .uri("/ws/"+cep+"/json", cep)
                        .retrieve()
                        .bodyToMono(Endereco.class);

                Endereco endereco = enderecoMono.block();

                return endereco;

        }

}
