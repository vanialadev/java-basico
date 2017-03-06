package br.com.vania.fj11.modelo;


public class Gerente extends Funcionario implements  Autenticavel {
	
	int senha;
    int numeroDeFuncionariosGerenciados;


    public void setSenha(int senha) {
    	this.senha = senha;
    }

	public double getBonus() {
		return this.salario * 0.3;
	}
	
	public void cobraEntrega() {
		System.out.println("Esta pronto?");
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
	
/*  return super.getBonificacao() + 1000;
	Aqui teríamos um problema: o dia que o getBonificacao do Funcionario mudar,
	precisaremos mudar o método do Gerente para acompanhar a nova bonificação.
	Para evitar isso, o getBonificacao do Gerente pode chamar o do Funcionario
	utilizando a palavra chave super.*/

}
