package com.bruno.webclient.service;

import br.com.revisao.entities.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
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

        // Nao vai funcionar pois nao existe um endpoint para essa URI , este método é um exemplo apenas
        public Endereco postEnderecoData(Endereco endereco){

                Mono<Endereco> enderecoMono = this.webClient
                        .post()
                        .uri("/ws/"+endereco+"/json", endereco)
                        .body(BodyInserters.fromValue(endereco))
                        .retrieve()
                        .bodyToMono(Endereco.class);

                Endereco block = enderecoMono.block();

                return block;

        }

}
