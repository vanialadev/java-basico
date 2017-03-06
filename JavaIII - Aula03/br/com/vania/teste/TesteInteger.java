package br.com.vania.teste;

import java.io.PrintStream;

public class TesteInteger {

	public static void main(String[] args) {
		
	    PrintStream saida = System.out;
	    saida.println("ola");
		
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		if(x1 == x2){
			System.out.println("igual");
		}else{
			System.out.println("diferente");
		}
		
		if(x1.equals(x2)){
			System.out.println("igual");
		}else{
			System.out.println("diferente");
		}
		
		System.out.println(x1.toString());
		
		String a = "12sscsc";
		String b = "15546";
		
		int c = 0;
		int d = Integer.parseInt(b);
		
		try{
			c = Integer.parseInt(a);
		} catch (java.lang.NumberFormatException e){
			System.out.println("Erro " + e);
		}
		System.out.println(c);
		System.out.println(d);
	}
}
