package br.com.vania.fj11.modelo;


public class Cliente implements Autenticavel {

	@SuppressWarnings("unused")
	private String nome;
	@SuppressWarnings("unused")
	private String endereco;
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha){
			System.out.println("Autenticado");
			return true;
		}
		System.out.println("Senha incorreta");
		return false;
	}
}
