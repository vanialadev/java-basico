package Aula06;

/**
 * @author vania
 *
 */
public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Ana");
		conta.deposita(100);
		
		try {
		conta.saca(200);
		} catch (SaldoInsuficienteException e){
			//System.out.println("saldo insuficiente");
			
			System.out.println(e.getMessage()); //msg da minha exception la da classe que eu criei
			
			System.out.println("Saldo está insuficiente: " + e.getSaldoAtual());
		} catch (Exception e){
			System.out.println("um outro erro qualquer");
		}

		System.out.println(conta.getTitular());
		System.out.println(conta.getSaldo());
	}
}
