package Aula06;

public class TestandoADivisao {

	public static void main(String[] args) {

		int i = 5111;
		try {
			i /= 0;
		} catch (java.lang.ArithmeticException e) {
			System.out.println("divisao por zero");
		}
		System.out.println(i);
	}
}
