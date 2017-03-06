package br.vania.jf11.threads.teste;

import br.vania.jf11.threads.modelo.BarraDeProgresso;

public class TestaConcorrencia {

	public static void main(String[] args) {
		
		
		
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread thread1 = new Thread(barra);
		thread1.start();
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		Thread thread2 = new Thread(copiador);
		thread2.start();
		

	}
}
