package br.com.revisao;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileClass {

    public static void main(String[] args) {
        File file = new File("ExampleFile.pdf");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        try {
            System.out.println("Arquivo criado ? : "+file.createNewFile());
            System.out.println("Caminho absoluto do arquivo criado: "+file.getAbsolutePath());
            System.out.println("Permissão para ler o arquivo? : "+file.canRead());
            System.out.println("Caminho dentro do projeto: "+file.getPath());
            System.out.println("Ultima edição do arquivo ? : "+simpleDateFormat.format(new Date(file.lastModified())));
            System.out.println("Deletou ? : "+file.delete());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
