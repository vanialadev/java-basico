package br.com.vania.teste;

public class TesteString {

	public static void main(String[] args) {
		
		
		String a = "Amanda";
		String b = "Mauricio";
		String c = "  dcdcdc  ";
		String d = "djcdjncjdsncjdcn";
		
		System.out.println(a.contains("Ama"));
		System.out.println(c.trim());
		System.out.println(b.isEmpty());
		System.out.println(d.length());
		
		
		TesteString t1 = new TesteString();

		

		t1.imprimePulandoLinha("Alura");
		t1.inverter("Socorram-me, subi no ônibus em Marrocos");
		t1.inverter("anotaram a data da maratona");
		t1.inverter2("Socorram-me, subi no ônibus em Marrocos");
		t1.inverter2("anotaram a data da maratona");
		t1.inverteComStringBuilder("Socorram-me, subi no ônibus em Marrocos");
		
	
	}
	
	public void imprimePulandoLinha(String string) {
		for(int i = 0; i <string.length(); i++){
			System.out.println(string.charAt(i));
		}
	}
	
	public void inverter(String string){
		for(int i = string.length() - 1; i >= 0; i--){
			System.out.print(string.charAt(i));
		}
		System.out.println();
	}
	
	public void inverter2(String string){
		String[] invertida = string.split(" ");	
		for (int i = invertida.length - 1; i >= 0; i--) {
			System.out.print(invertida[i] + " ");
		}
		System.out.println();
	}
	
    public void inverteComStringBuilder(String texto) {
        System.out.print("\t");
        StringBuilder invertido = new StringBuilder(texto).reverse();
        System.out.println(invertido);
    }

}	
