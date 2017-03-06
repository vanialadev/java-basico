/**
 * 
 */
package Aula04;

/**
 * @author vania
 *
 */
public class ContaPoupanca extends Conta {
	
	double nome;
	


    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }



	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
		
	}
    
    
	
}
