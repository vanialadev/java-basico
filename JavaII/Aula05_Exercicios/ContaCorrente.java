package Aula05_Exercicios;

public class ContaCorrente extends Conta implements Tributavel{

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
		
	}


}
