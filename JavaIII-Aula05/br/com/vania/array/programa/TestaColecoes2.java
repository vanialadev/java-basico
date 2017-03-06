package br.com.vania.array.programa;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import br.com.vania.array.modelo.Conta;

public class TestaColecoes2 {
	
	public static void main(String[] args) {
		
		List<String> nomes = new LinkedList<String>();
		
		nomes.add("Ana");
		nomes.add("Ana");
		nomes.add("Pedro");
		
	//	System.out.println(nomes.size());
		
		Set<String> nomes2 = new HashSet<String>();//nao tem duplicidade de elementos
		
		nomes2.add("Ana");
		nomes2.add("Ana");
		nomes2.add("Pedro");

	//	System.out.println(nomes2.size());
		
		
		Set<Conta> contas = new HashSet<Conta>();//add so 1, pq o vslor diz se é igual
//		Collection<Conta> contas2 = new ArrayList<Conta>();//add 3 vzs
		
		
		Conta c1 = new Conta(1500);
		Conta c2 = new Conta(1500);
		
		contas.add(c1);
		contas.add(c1);
		contas.add(c2);
		
		System.out.println(contas.size());
		

	}

}
