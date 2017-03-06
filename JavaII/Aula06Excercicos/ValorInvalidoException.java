package Aula06Excercicos;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException{
	
	
	public ValorInvalidoException(double valor){
		super("Valor negativo" + valor);
	}

}
