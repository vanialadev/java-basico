package br.vania.jf11.threads.teste;

public class CopiadorDeArquivos implements Runnable {

	public void run(){
		for (int i = 0; i < 10000; i++) {
			System.out.println("copiador ");
		}
	}
}
