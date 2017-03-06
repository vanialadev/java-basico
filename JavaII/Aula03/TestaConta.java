package Aula03;

/**
 * @author vania
 *
 */
public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta("Ana", 123, 450);
		conta.setNome("Ana");
		conta.imprime();

		System.out.println(conta.getNome());
	}
}
