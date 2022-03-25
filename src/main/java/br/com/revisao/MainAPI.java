package br.com.revisao;

import br.com.revisao.entities.Endereco;

import java.util.Scanner;

public class MainAPI {


        private static ConsumindoAPI buscaEnderecoPelo;

        public MainAPI(ConsumindoAPI buscaEnderecoPelo) {
            this.buscaEnderecoPelo = buscaEnderecoPelo;
        }


    public static void main(String[] args) throws Exception {
            System.out.print("Informe seu CEP: ");
            String cep = new Scanner(System.in).nextLine();
            Endereco endereco = buscaEnderecoPelo.buscaEnderecoPelo(cep);

            System.out.println("Logradouro: " + endereco.getLogradouro());
            System.out.println("Bairro: " + endereco.getBairro());
            System.out.println("Localidade: " + endereco.getLocalidade());
        }
}