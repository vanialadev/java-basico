package br.com.vania.array.modelo;

/**
 * @author vania
 *
 */
public class Conta implements Comparable<Conta> {

	protected double saldo;
	private String titular;
	private int agencia;
	public int numero;

	public Conta() {
		super();
	}

	public Conta(String nome, int agencia, double saldo) {
		super();
		this.titular = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	

	public Conta(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

/*	public boolean saca(double valor) throws Exception {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			throw new SaldoInsuficienteException(saldo);
			// throw new RuntimeException();
		}
	}*/

	public void deposita(double valor) {
		if (valor < 0) {
			// throw new IllegalArgumentException(); desse jeiot pra imprimir
			// TestaConta linha 17
			throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo"); // aqui
																								// manda
																								// a
																								// mensagem
																								// pro
																								// o
																								// e.getMessage()
		} else {
			this.saldo += valor;
		}
	}

/*	public void deposita2(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}*/

	public void imprime() {

		System.out.println(titular);
		System.out.println(agencia);
		System.out.println(saldo);
	}

	@Override
	public String toString() {
		return "Conta com saldo: " + this.saldo + " numero da conta: " + numero;
	}
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
*/
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	@Override
	public int compareTo(Conta outra) { // comprar pelo saldo	
		if(this.saldo < outra.saldo){
			return -1;
		}
		if (this.saldo > outra.saldo){
			return 1;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	/*    @Override
    public int compareTo(Conta outra) { // comparar nome do cliente por ordem alfabetica
        return this.titular.compareTo(outra.titular);
    }*/
	
	
}

