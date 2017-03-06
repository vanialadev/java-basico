package Aula06Excercicos;

/**
 * @author vania
 *
 */
public class Conta {

	private double saldo;
	private String titular;
	private int agencia;
	@SuppressWarnings("unused")
	private int numero;

	public Conta() {
		super();
	}

	public Conta(String nome, int agencia, double saldo) {
		super();
		this.titular = nome;
		this.agencia = agencia;
		this.saldo = saldo;
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

}
