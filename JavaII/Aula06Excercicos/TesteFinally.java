package Aula06Excercicos;

public class TesteFinally {

/**
 * @param args
 */
public static void main(String[] args) {
	
	
	try {
		  int total = 10+10;
		  System.out.println(total);
		} catch(Exception e) {
		  System.out.println("deu erro");
		} finally {
		  System.out.println("acabou");
		}
	
	try {
		  throw new RuntimeException("excecao forcada");
		} catch(Exception e) {
		  System.out.println("deu erro");
		} finally {
		  System.out.println("acabou");
		}
}
}
