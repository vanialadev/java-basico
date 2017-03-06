package br.com.vania.fj11.programa;

import br.com.vania.fj11.modelo.Cliente;
import br.com.vania.fj11.modelo.Conta;
import br.com.vania.fj11.modelo.GuardadorDeObjetos;

public class TestaJavaLang {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(500);
		Conta c2 = new Conta(500);
		

		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		armario.adiciona(c1);
		armario.adiciona(c2);
		
		Cliente joao = new Cliente();
		armario.adiciona(joao);
		
		Conta c1NoArmario = (Conta) armario.pega(0);
		
		System.out.println(c1NoArmario.getSaldo());
		
		System.out.println(c1.toString()); //ou c1;
		
		if(c1.equals(c2)){
			System.out.println("são iguais");
		}else{
			System.out.println("são diferentes");
		}
		if(c1.equals(joao)){
			System.out.println("são iguais");
		}else{
			System.out.println("são diferentes");
		}
		
		
//		Cliente joaoNoArmario = (Cliente) armario.pega(2);	
//		System.out.println(c1.getSaldo());
		
	}
}
