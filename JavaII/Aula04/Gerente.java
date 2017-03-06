package Aula04;

public class Gerente extends Funcionario {
	
	int senha;
    int numeroDeFuncionariosGerenciados;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    public void setSenha(int senha) {
    	this.senha = senha;
    }

	public double getBonus() {
		return this.salario * 0.3;
	}
	
/*  return super.getBonificacao() + 1000;
	Aqui teríamos um problema: o dia que o getBonificacao do Funcionario mudar,
	precisaremos mudar o método do Gerente para acompanhar a nova bonificação.
	Para evitar isso, o getBonificacao do Gerente pode chamar o do Funcionario
	utilizando a palavra chave super.*/

}
