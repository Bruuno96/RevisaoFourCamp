package br.com.revisao.Util;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {

    // reposta recebe cada linha do bufferdReader e o jsonEmString concatena as linhas e forma um "JSON" porém em String
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}