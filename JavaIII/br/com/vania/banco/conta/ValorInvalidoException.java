package br.com.vania.banco.conta;


@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException{
	
	
	public ValorInvalidoException(double valor){
		super("Valor negativo" + valor);
	}

}
