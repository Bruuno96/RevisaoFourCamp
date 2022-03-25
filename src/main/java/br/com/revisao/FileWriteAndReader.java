package br.com.revisao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

/*
CLASSES IO

File
FileWriter == BufferedWriter
FileReader == BufferedReader

Tanto BufferedReader quanto BufferedWriter são otimizações da FileRead e FileWriter

 */



public class FileWriteAndReader {

    public static void main(String[] args) {

//        Criar diretório
          File file = new File("Arquivo.txt");
//        file.mkdir();
//        file.delete();

        try (FileWriter fileWriter = new FileWriter(file);
             FileReader fileReader = new FileReader(file)){

            fileWriter.write("Escrevendo um texto \nE pulando uma linha usando FileWriter");
            fileWriter.flush();
            char[] chars = new char[58];
            fileReader.read(chars);
            for (char character: chars){

                System.out.print(character);
            }
        }catch (IOException exception){
                exception.getMessage();
        }





    }


}
