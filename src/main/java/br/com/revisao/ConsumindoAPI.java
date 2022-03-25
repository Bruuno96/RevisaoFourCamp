package br.com.revisao;

import br.com.revisao.entities.Endereco;
import com.google.gson.Gson;
import jdk.jshell.execution.Util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static br.com.revisao.Util.Util.converteJsonEmString;

public class ConsumindoAPI {
    static String webService = "http://viacep.com.br/ws/";
    static int codigoSucesso = 200;

    public static Endereco buscaEnderecoPelo(String cep) throws Exception {
        String urlParaChamada = webService + cep + "/json";

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            System.out.println("Buffered Message: "+resposta.toString());
            String jsonEmString = converteJsonEmString(resposta);



            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(jsonEmString, Endereco.class);

            return endereco;
        } catch (Exception e) {
            throw new Exception("ERRO: " + e.getMessage());
        }
    }
}
