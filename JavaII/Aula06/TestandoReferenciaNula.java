package Aula06;

public class TestandoReferenciaNula {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Conta c = null;
		
		try {
		System.out.println(c.getSaldo());
		
		}catch (java.lang.NullPointerException e){
			System.out.println("eita doido");
		}
	}
}
