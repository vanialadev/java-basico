package Aula05;

public abstract class Funcionario {
	
	protected String nome;
	protected double salario;
	
	public String getNome() {
		return nome;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonus();

	
}
