package _ExemploAula;

public class Conta {
	
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;
	
	private static int numeroIncremetal = 1;
	
	public static int x(){
		return 2*2;
	}
	
	public Conta(int numero, double limite){
		this(numero, limite, 0);
	}

	public Conta(int numero, double saldo, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public Conta(){
		this.numero = numeroIncremetal;
		numeroIncremetal++;
	}
	
	public void saca(double valor){
		
		if(valor > this.saldo +this.limite){
			System.out.println("saque invalido");
		}else{
			this.saldo -= valor; 
	
		}
	}

}
