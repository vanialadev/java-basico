package Aula05;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente ana = new Gerente();
		
		ana.setSalario(2000);
		System.out.println(ana.getBonus());
		
		ana.setSenha(123);
		ana.autentica(123);
		ana.autentica(456);
		
		Desenvolvedor ivo = new Desenvolvedor();
		
		ivo.setSalario(3000);
		System.out.println(ivo.getBonus());
		
		Diretor diretor = new Diretor();
		
		diretor.setSenha(123);
		diretor.autentica(123);
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		
		totalizador.adiciona(ana);
		totalizador.adiciona(ivo);
		
		System.out.println(totalizador.getTotal());
		
	}

}
