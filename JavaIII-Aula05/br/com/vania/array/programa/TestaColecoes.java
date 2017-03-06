package br.com.vania.array.programa;


import java.util.ArrayList;

import br.com.vania.array.modelo.Conta;

public class TestaColecoes {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Vania");
		nomes.add("Erica");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Vania"));
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
	//	Collections.sort(nomes);
		System.out.println("ordenado!");
		
		for (String string : nomes) {
			System.out.println(string);
		}
		
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta(1500);
		Conta c2 = new Conta(500);
		
		contas.add(c1);
		contas.add(c2);
		
		
		System.out.println(contas.get(0));
		//	Collections.sort(contas);

		
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
}
