package _Exemplos;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario joao =  new Funcionario(null, 0);
		
		joao.setSalario(1000);
		System.out.println(joao.getBonus());
		
		Gerente ana = new Gerente(null, 0);
		
		ana.setSalario(2000);
		System.out.println(ana.getBonus());
		
		ana.setSenha(123);
		ana.autentica(123);
		ana.autentica(456);
		
		Desenvolvedor ivo = new Desenvolvedor(null, 0);
		
		ivo.setSalario(3000);
		System.out.println(ivo.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		
		totalizador.adiciona(ana);
		totalizador.adiciona(ivo);
		totalizador.adiciona(joao);
		
		System.out.println(totalizador.getTotal());
		
	}

}
