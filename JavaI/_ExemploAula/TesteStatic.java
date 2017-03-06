package _ExemploAula;

public class TesteStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Conta joao = new Conta();
		System.out.println(joao.numero);
		
		Conta eva = new Conta();
		System.out.println(eva.numero);
		
		System.out.println(Conta.x());

	}

}
