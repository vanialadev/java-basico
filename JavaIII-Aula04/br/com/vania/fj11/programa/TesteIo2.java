package br.com.vania.fj11.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteIo2 {
	public static void main(String[] args) throws IOException {
		
			
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("ler.txt")));
		// como só é usado o br, pode ser feito isso
		
		BufferedWriter bw =new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("sai.txt")));
		
		
		String line = br.readLine();
		
/*		while(line != null){
			System.out.println(line);
			line = br.readLine();
		}*/
		
		while(line != null){
			bw.append(line); // escrvendo no arquivo de texto sai.txt, com os
			bw.newLine();		// dados do leitura de texto
			line = br.readLine();
		}
		
		br.close();
		bw.close();
	}

}