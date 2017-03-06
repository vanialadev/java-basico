/**
 * 
 */
package Aula02;

/**
 * @author vania
 *
 */
public class ContaPoupanca extends Conta {
	
	double nome;
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }
    
    
	
}
