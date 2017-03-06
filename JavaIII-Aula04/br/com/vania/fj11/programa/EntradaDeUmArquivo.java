package br.com.vania.fj11.programa;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {
    public static void main(String[] args) throws IOException {
    	
  //      InputStream is = new FileInputStream("arquivo.txt"); //ler no arquivo e mostra no conse=ole
        InputStream is = System.in; //escreve no console e mostra no console 
        Scanner entrada = new Scanner(is);

        System.out.println("Digite sua mensagem:");
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
        entrada.close();
    }
}
