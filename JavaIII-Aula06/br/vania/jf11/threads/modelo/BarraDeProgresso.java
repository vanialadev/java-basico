package br.vania.jf11.threads.modelo;

public class BarraDeProgresso implements Runnable {

	
	public void run(){
		for (int i = 0; i < 10000; i++) {
			System.out.println("barra ");
		}
	}
	
}
