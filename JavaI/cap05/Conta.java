package cap05;

public class Conta {
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	private int numero;
	private Pessoa titular;
	private double saldo;
	private int agencia;
	
	void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado;
	}

	void saca(double valorASerSacado){
		if(this.saldo >= valorASerSacado){
			this.saldo -= valorASerSacado;
		}
	}
	
	void trasnfere(double valorASerTransferido, Conta contaDestino){
		this.saldo -= valorASerTransferido;
		contaDestino.saldo += valorASerTransferido;
	}
}
