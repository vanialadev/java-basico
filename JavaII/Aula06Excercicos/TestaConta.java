package Aula06Excercicos;

/**
 * @author vania
 *
 */
public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setTitular("Ana");

		try {
			conta.deposita(-100);
		} catch (IllegalArgumentException e) {
			System.out.println("Você tentou depositar um valor inválido");
			System.out.println("Erro: " + e); // diz o erro e a msg que eu voloquei na classe
			System.out.println(e.getMessage());
			e.printStackTrace();// imprimie o tipo do erro e onde acontece
		} //try catch no metodo deposita, ta comentado
		
		conta.deposita2(-300); // com msg no construtor
		
        try {
            conta.deposita2(-100);
        } catch (ValorInvalidoException e) {
        	System.out.println(e.getMessage());
            System.out.println("Valor não pode ser negativo"); // sem msg no construtor
        }
		
		
		try {
			conta.saca(200);
		} catch (SaldoInsuficienteException e) {
			// System.out.println("saldo insuficiente");

			System.out.println(e.getMessage()); // msg da minha exception la da
												// classe que eu criei

		//	System.out.println("Saldo está insuficiente: " + e.getSaldoAtual());
		} catch (Exception e) {
			System.out.println("um outro erro qualquer");
		}

		/*
		 * System.out.println(conta.getTitular());
		 * System.out.println(conta.getSaldo());
		 */
	}
}
