package br.com.vania.array.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import br.com.vania.array.modelo.ContaCorrente;

public class TestaOrdencao {

	public static void main(String[] args) {
	//	 List<ContaCorrente> contas = new LinkedList<ContaCorrente>();
		 List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		 
		 Random random = new Random();

		 	ContaCorrente c1 = new ContaCorrente(400, "Caio");
	        c1.deposita(1500.0);
	        contas.add(c1);

	        ContaCorrente c2 = new ContaCorrente(467, "Adriano");
	        c2.deposita(2050.99);
	        contas.add(c2);

	        ContaCorrente c3 = new ContaCorrente(230, "Victor");
	        c3.deposita(1070.0);
	        contas.add(c3);
	      
	        
	        ContaCorrente c4 = new ContaCorrente(random.nextInt(2000), "Maria");
	        c1.deposita(random.nextInt(10000) + random.nextDouble());
	        contas.add(c4);

	        ContaCorrente c5 = new ContaCorrente(random.nextInt(2000), "Ana");
	        c2.deposita(random.nextInt(10000) + random.nextDouble());
	        contas.add(c5);

	        ContaCorrente c6 = new ContaCorrente(random.nextInt(2000), "Ivo");
	        c3.deposita(random.nextInt(10000) + random.nextDouble());
	        contas.add(c6);
	        
	        Collections.sort(contas);
	        
	        for (ContaCorrente contaCorrente : contas) {
				System.out.println(contaCorrente);
			}
	        
	        Collections.reverse(contas);
	        
	        for (ContaCorrente contaCorrente : contas) {
				System.out.println(contaCorrente);
			}
		 
	        Collections.rotate(contas, 2);
	        
	        for (ContaCorrente contaCorrente : contas) {
				System.out.println(contaCorrente);
			}
	        Collections.shuffle(contas);
	        
	        for (ContaCorrente contaCorrente : contas) {
				System.out.println(contaCorrente);
			}
	        
	        System.out.println(contas);

	}
}
