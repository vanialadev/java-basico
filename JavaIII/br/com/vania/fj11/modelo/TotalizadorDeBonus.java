package br.com.vania.fj11.modelo;
public class TotalizadorDeBonus {

	
	private double total = 0;
	
	public void adiciona(Funcionario f){
		this.total += f.getBonus();
	}
	
	public double getTotal(){
		return this.total;
	}
}
