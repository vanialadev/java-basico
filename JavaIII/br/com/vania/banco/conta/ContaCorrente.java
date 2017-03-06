package br.com.vania.banco.conta;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int numero, String titular) {
		super(numero, titular);
	}
	public ContaCorrente() {
		super();
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
		
	}


}
