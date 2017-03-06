package cap02;

public class fatorial {

	public static void main(String[] args) {
		
		long fatorial = 1;
		
		for (int i = 1; i < 20; i++) {	
			fatorial *=i;
			System.out.println(fatorial);
		}
	}
}
