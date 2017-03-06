package br.com.vania.fj11.programa;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class TesteScanner {

	public static void main(String[] args) throws IOException {
		
		
/*		Scanner sc = new Scanner(System.in);
	     int i = sc.nextInt();
	     
	     System.out.println(i);*/
	
/*	      Scanner sc = new Scanner(new File("myNumbers.txt"));
	      while (sc.hasNextLong()) {
	          long aLong = sc.nextLong();
	          System.out.println(aLong);
	      }*/
		
/*		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();*/
		
	     String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input);
	     s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
	     MatchResult result = s.match();
	     for (int i=1; i<=result.groupCount(); i++)
	         System.out.println(result.group(i));
	     s.close(); 
}
}