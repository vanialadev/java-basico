package Aula06;

import java.io.FileNotFoundException;

public class TesteIO {
	
	@SuppressWarnings("resource")
	public static void metodo() throws FileNotFoundException {
        new java.io.FileInputStream("arquivo.txt");
    }
	
	@SuppressWarnings("resource")
	public static void metodo2() {
        try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("nao foi possivel abrir o arquivo");
		}
    }

}
