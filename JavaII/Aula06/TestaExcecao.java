package Aula06;

public class TestaExcecao {
	public static void main(String[] args) {

		System.out.println("início main");
	//	try {
			m1();
	//	}catch(ArrayIndexOutOfBoundsException e){
	//		System.out.println("problema!");
	//	}	
		System.out.println("fim main");

	}

	private static void m1() {
		System.out.println("inicio m1");
	//	try {
			m2();
	//	}catch(ArrayIndexOutOfBoundsException e){
	//		System.out.println("problema!");
	//	}	
		System.out.println("fim m1");
	}

	private static void m2() {
		
		System.out.println("inicio m2");
		
		int[] nums = new int[5];
		for (int i = 0; i < nums.length + 1; i++) {
			try {
				nums[i] = i * 2;
				System.out.println(nums[i]);
			
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("problema!");
			}
		}
		System.out.println("fim m2");
		
	}
}
