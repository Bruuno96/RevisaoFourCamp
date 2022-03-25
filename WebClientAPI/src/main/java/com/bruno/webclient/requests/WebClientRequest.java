package com.bruno.webclient.requests;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebClientRequest {

    @Bean
    public WebClient webClientEndereco(WebClient.Builder builder){

        return builder
                .baseUrl("https://viacep.com.br")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
