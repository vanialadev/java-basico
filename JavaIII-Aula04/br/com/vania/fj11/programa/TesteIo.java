package br.com.vania.fj11.programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteIo {
	public static void main(String[] args) throws IOException {
		
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.println("Digite sua mensagem: ");
		String line = br.readLine();
		
		while(line != null){
			System.out.println(line);
			line = br.readLine();
		}
		
		br.close();
	}

}
