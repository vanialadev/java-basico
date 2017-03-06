package br.com.vania.array.modelo;

public class ContaCorrente extends Conta {	

	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(int numero, String titular) {
		super(numero, titular);
	}

/*	public int compareTo(ContaCorrente outra) {
        if (this.saldo < outra.saldo) {
          return -1;
        }

        if (this.saldo > outra.saldo) {
          return 1;
        }

        return 0;
      }
*/
}
