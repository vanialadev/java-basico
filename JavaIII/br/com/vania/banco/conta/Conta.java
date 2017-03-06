package br.com.vania.banco.conta;
import br.com.vania.banco.conta.SaldoInsuficienteException;
import br.com.vania.banco.conta.ValorInvalidoException;

/**
 * @author vania
 *
 */
public abstract class Conta {

	protected double saldo;
	protected String titular;
	protected int agencia;
	protected int numero;

	public Conta() {
		super();
	}

	public Conta(String titular, int agencia, double saldo) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}


	public boolean saca(double valor) throws Exception {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			throw new SaldoInsuficienteException(saldo);
			//throw new RuntimeException();
		}
	}

	public void deposita(double valor) {
		if(valor < 0){
//			throw new IllegalArgumentException(); desse jeiot pra imprimir TestaConta linha 17
			throw new IllegalArgumentException("Você tentou depositar" + 
                    " um valor negativo"); // aqui manda a mensagem pro o e.getMessage()
		}else{
			this.saldo += valor;
		}
	}
	
	public void deposita2(double valor) throws ValorInvalidoException{
		if(valor < 0){
			throw new ValorInvalidoException(valor);
		}else{
			this.saldo += valor;
		}
	}
	
	public abstract void atualiza(double taxa);


	public void imprime() {

		System.out.println(titular);
		System.out.println(agencia);
		System.out.println(saldo);
	}

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
	public String toString() {
        return "esse objeto é uma conta com saldo R$" + this.saldo;

	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.titular == outraConta.titular;
	}
	
/*	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero&& 
                    this.titular.equals(outraConta.titular);
	}*/
}
