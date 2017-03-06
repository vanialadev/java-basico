/**
 * 
 */
package Aula04;

/**
 * @author vania
 *
 */
public class TestaContas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Conta[] conta = new Conta[10];
		
		
		ContaCorrente cc = new ContaCorrente();
		
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.deposita(1000);
		cp.deposita(1000);

		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.1);
		
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());

		
	}

}
