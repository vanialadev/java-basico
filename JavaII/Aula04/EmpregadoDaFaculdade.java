package Aula04;

public class EmpregadoDaFaculdade {
	private String nome;
	private double salario;

	double getGastos() {
		return this.salario;
	}

	String getInfo() {
		return "nome: " + this.nome + " com salário " + this.salario;
	}
	
	double getSalario(){
		return this.salario;
	}
	
	void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// métodos de get, set e outros
}
