package cap02;

public class variavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 13;
		
		while(x != 1){
			System.out.print(x + " > ");
			if(x % 2 == 0){
				x /= 2;
			}else{
				x = 3 * x + 1;
			}
		}
		System.out.print(x);
	}
}


class TresNMaisUm {
    public static void main(String[] args) {
        int x = 13;
        System.out.println("Iniciando...\n");
        while (x != 1) {
            System.out.print(x + " > ");
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x =(( 3 * x) + 1);
            }
        }
        System.out.print(x);
    }
}