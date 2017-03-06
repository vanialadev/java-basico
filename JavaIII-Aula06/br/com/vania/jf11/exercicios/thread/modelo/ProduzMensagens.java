package br.com.vania.jf11.exercicios.thread.modelo;

import java.util.Collection;

public class ProduzMensagens implements Runnable {

	protected int comeco;
	protected int fim;
	protected Collection<String> mensagens;

	public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

/*	@Override
	public void run() {
		for (int i = comeco; i <= fim; i++) {
			synchronized (mensagens) {
				mensagens.add("Mensagem " + i);
			}
		}*/
		@Override
		public void run() {
			for (int i = comeco; i <= fim; i++) {
					mensagens.add("Mensagem " + i);
			}

		/*
		 * @Override public synchronized void run() { for (int i = comeco; i <=
		 * fim; i++) { mensagens.add("Mensagem " + i); }
		 */

	}

}
