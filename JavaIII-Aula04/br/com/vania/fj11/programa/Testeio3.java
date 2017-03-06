package br.com.vania.fj11.programa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Testeio3 {

	public static void main(String[] args) throws IOException {
		
		
//		Scanner sc = new Scanner(new FileInputStream("ler.txt")); //ler arquivo
		Scanner sc = new Scanner(System.in); //ler arquivo
		PrintStream ps =  new PrintStream(new FileOutputStream("saida.txt")); //escrve arquivo

		
		while(sc.hasNextLine()){
			String linha = sc.nextLine();
			ps.println(linha);
		}
		
		sc.close();
		ps.close();

	}
}
