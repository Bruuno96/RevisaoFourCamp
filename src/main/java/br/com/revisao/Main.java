package br.com.revisao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import br.com.revisao.Util.UtilDateTime;
import br.com.revisao.entities.*;


public class Main {

    public static void main(String[] args) throws DividiPorZeroException, ParseException {


//        Gerente gerente = new Gerente("Bruno");
//
//        Operador operador = new Operador("Beatriz");
//
//        List<Operador> listaOperadores = new ArrayList<>();
//
//        Operador operador2 = new Operador("Fábio");
//
//        listaOperadores.addAll(Arrays.asList(operador,operador2));
//
//        gerente.setEquipe(listaOperadores);
//
//        System.out.println(gerente.getEquipe());
//
// =================== VETOR ================
//        int[] vetorDeNumeros = new int[5];

//        int length = vetorDeNumeros.length;
//        vetorDeNumeros[0] = 1;
//        vetorDeNumeros[1] = 2;
//        vetorDeNumeros[2] = 3;
//        vetorDeNumeros[3] = 4;
//        vetorDeNumeros[4] = 5;
//
//        //  [67,33,45,789,12]
////        contador = contador + 1;
////        contador += 1;
////        contador++
//
//        int total = 0;
//        for(int contador = 0; contador < vetorDeNumeros.length; contador++){
//            total  += vetorDeNumeros[contador];
//            System.out.println("Numero: "+vetorDeNumeros[contador]+ " na posição "+contador);
//            System.out.println(total);
//        }


// =================== FOREACH ================
//        List<String> lista = new ArrayList<>();
//
//        lista.add("Bruno");
//        lista.add("Beatriz");
//        lista.add("Fabio");






//        // FORMA 0
//        for(int contador = 0; contador < lista.size(); contador++){
//            System.out.println(lista.get(contador));
//        }

        // FORMA 1
//        for(String contador : lista){
//
//            System.out.println(contador);
//        }
//

        // Lista de pessoas
//        List<Pessoa> listaPessoas = new ArrayList<>();
//        Operador operador = new Operador("Bruno");
//        Operador operador2 = new Operador("Beatriz");
//        Operador operador3 = new Operador("Fábio");
//
        // Adicionei pessoas à lista
//        listaPessoas.addAll(Arrays.asList(operador,operador2,operador3));
//
//        // Filtrei as pessoas com o nome Bruno
//        List<Pessoa> listaFiltrada = listaPessoas.stream().
//                filter(contador -> contador.getName().startsWith("B")).collect(Collectors.toList());

//        Map<Integer, String> listaComChaveEValor = new HashMap<>();
//        listaComChaveEValor.put(1, "linode.com");
//        listaComChaveEValor.put(2, "heroku.com");

        //Map -> Stream -> Filter -> MAP
//        Map<Integer, String> collect = listaComChaveEValor.entrySet().stream()
//                .filter(x -> x.getKey() == 2)
//                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
//
//        collect.forEach((chave,valor) -> System.out.println("Chave: "+chave+"\nValor: "+valor));
//
//        // FORMA 2 Usando LAMBDA
//        // Imprimi as pessoas selecionadas
//        listaFiltrada.forEach((contador) -> System.out.println(contador.getName()));
////
////        // FORMA 3
//        listaPessoas.forEach(System.out::println);


//        Gerente gerente = new Gerente();
//        gerente.descriptionDressCode("Esporte fino");
//
//        Operador operador = new Operador();
//        operador.descriptionDressCode("À rigor");
//
//
//        System.out.println("Dress code: "+gerente.getDressCode());
//        System.out.println("Dress code: "+operador.getDressCode());
//

//        try {
//            double total = 2 / 0;
//        }catch (ArithmeticException exception){
//            System.out.println(new DividiPorZeroException("Erro ao dividir por zero").getMessage());
//        }

//        System.out.println(lista.contains("Bruno"));
//        System.out.println(lista.isEmpty());
//        System.out.println();
//
//        [bruno, beatriz, fabio]

//        lista.sort(String.CASE_INSENSITIVE_ORDER);


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Calendar calendar = Calendar.getInstance();
        calendar.set(2022,2,22);
        Date date = calendar.getTime();

        Date dataAtual = Calendar.getInstance().getTime();
//        System.out.println(sdf.format(date));
//
//
        long dataDeHoje = dataAtual.getTime();
        long dataDeQuatroDiasDepois = date.getTime();


        long  diferenca = Math.abs(dataDeQuatroDiasDepois - dataDeHoje);
        long diff = TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
////
        System.out.println(diferenca);
////
//        if(dataAtual.after(date)){
//            System.out.println(sdf.format(dataAtual)+" é antes que "+sdf.format(date));
//        }
//
//        UtilDateTime.diferencaDataAteJava7();
//        UtilDateTime.diferencaDataJava8();
        //UtilDateTime.diferencaDataJava8ComTempo();
        UtilDateTime.diferencaDataJava8ComChronoUnit();
//        System.out.println(sdf.format(date));



    }
}
