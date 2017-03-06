package cap05;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setTitular(new Pessoa());
		conta.getTitular().setNome("Vania Almeida");
	
//		conta.saldo = 1000;
//		conta.titular.cpf = "123456789";
//		conta.titular.dataDeNascimento = "11/05/1990";
//		conta.agencia = 1234;
//		conta.numero = 81353;
		
		Conta joao = new Conta();
//		joao.titular = new Pessoa();
		
//		joao.titular.nome = "Joao Pessoa";
//		joao.saldo = 500;
		
		joao.saca(50);
		conta.deposita(500);
		conta.trasnfere(50, joao);
		
//		System.out.println(conta.saldo);
//		System.out.println(joao.saldo);
		
		
	}
}
