package br.com.revisao;

import javax.imageio.IIOException;
import java.io.*;

public class StreamTest {

        public static void main (String[] args) {
            leitor();
}
        private static void gravador () {
            byte[] dados = {65, 66, 67, 68, 69, 70};
            try (FileOutputStream gravador = new FileOutputStream("pasta\\stream.txt")) {
                gravador.write(dados);
                System.out.println("Dados gravados com sucesso!");
            } catch (IIOException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            private static void leitor(){
            try(FileInputStream fos = new FileInputStream("pasta\\stream.txt")) {
                int leitura;
                while ((leitura = fos.read()) != -1) {
                    char x = (char) leitura;
                    System.out.print(" "+x);
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            }
        }