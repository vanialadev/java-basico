package br.com.vania.fj11.excecao;


@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException{
	
	
	public ValorInvalidoException(double valor){
		super("Valor negativo" + valor);
	}

}
