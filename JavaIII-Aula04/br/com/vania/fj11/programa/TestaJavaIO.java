package br.com.vania.fj11.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class TestaJavaIO {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("leitura.txt"); // ler byte
//		InputStream is = System.in; //deixa de pegar de um arquivo e pega do console
		InputStreamReader isr = new InputStreamReader(is); // ler char
		BufferedReader br = new BufferedReader(isr);// ler string

		OutputStream os = new FileOutputStream("saida.txt"); // escrve byte
//		OutputStream os = System.out; //aqui a senha deixa de ir pro arqivo e vai pro console
		OutputStreamWriter osw = new OutputStreamWriter(os); // escrve char
		BufferedWriter bw = new BufferedWriter(osw); // escreve string

		String linha = br.readLine();


/*		while(linha != null) { // lendo o arquivo de texto leirura
		  System.out.println(linha);
		  linha = br.readLine();
		}*/


		while (linha != null) {
			bw.append(linha); // escrvendo no arquivo de texto saida.txt, com os
			bw.newLine();		// dados do leitura de texto
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}
}
