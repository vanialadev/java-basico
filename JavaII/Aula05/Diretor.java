package Aula05;

public class Diretor extends Funcionario implements Autenticavel {
	
	int senha;

    public void setSenha(int senha) {
    	this.senha = senha;
    }

	@Override
	public double getBonus() {
		return this.salario * 0.35;
	}
	
	public void cobrarRelatorios() {
		System.out.println("Preciso dos Relatórios");
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha==senha){
			System.out.println("Autenticado");
			return true;
		}
		System.out.println("Senha incorreta");
		return false;
	}

	

}
