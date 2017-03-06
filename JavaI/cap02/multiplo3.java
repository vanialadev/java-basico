package cap02;

public class multiplo3 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				System.out.print(i+" ");				}
		}
		System.out.println();
		for (int i = 3; i < 101; i += 3) {
			if(i % 3 == 0) {
				System.out.print(i+" ");				}
		}
		
	}
}
