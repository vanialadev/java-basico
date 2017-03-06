/**
 * 
 */
package Aula02;

/**
 * @author vania
 *
 */
public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new Conta();
		
		ContaCorrente cc = new ContaCorrente();
		
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
//		
//		System.out.println(c.getSaldo());
//		System.out.println(cc.getSaldo());
//		System.out.println(cp.getSaldo());
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.1);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());

		
	}

}
