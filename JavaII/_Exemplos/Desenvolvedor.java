package _Exemplos;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	public double getBonus() {
		return this.salario * 0.25;
	}
}
