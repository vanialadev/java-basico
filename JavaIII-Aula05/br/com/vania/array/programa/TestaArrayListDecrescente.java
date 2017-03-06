package br.com.vania.array.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaArrayListDecrescente {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 1; i <1001; i++){
			lista.add(i);
		}
		
		
		Collections.reverse(lista);
		
		for (Integer integer : lista) {
			System.out.print(integer + " ");
		}
	}
}
