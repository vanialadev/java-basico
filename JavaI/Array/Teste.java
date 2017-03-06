package Array;

class Teste {
    public static void main (String[] args) {
    	
    	String[] args2 = new String[5];
    	
    	args2[0] = "1";
    	args2[1] = "2";
    	args2[2] = "3";
    	args2[3] = "4";
    	args2[4] = "5";
    	
    	int[] args3 = new int[5];
    	
    	args3[0] = 1;
    	args3[1] = 2;
    	args3[2] = 3;
    	args3[3] = 4;
    	args3[4] = 5;
    	
        for(String argumento: args2) {
            System.out.print(argumento + " ");
        }
        
        System.out.println();
        
        for(int i = 0; i< args2.length; i++) {
            System.out.print(args2[i] + " ");
        }
        System.out.println();
        
        for(int argumento: args3) {
            System.out.print(argumento + " ");
        }
        
        System.out.println();
        
        for(int i = 0; i< args3.length; i++) {
            System.out.print(args3[i] + " ");
        }
    }
}