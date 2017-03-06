package br.com.vania.fj11.programa;

import java.io.*;
import java.util.Scanner;

/**
 * Created by vania on 22/02/17.
 */
public class TesteIO4 {
    public static void main(String[] args) throws IOException {

        InputStream is = System.in;
        Scanner entrada = new Scanner(is);

        OutputStream os = new FileOutputStream("saida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        System.out.println("Digite sua mensagem:");

        while(entrada.hasNextLine()){
            String linha = entrada.nextLine();
            bw.write(linha);
            bw.newLine();
        }

        entrada.close();
        bw.close();

    }

}


