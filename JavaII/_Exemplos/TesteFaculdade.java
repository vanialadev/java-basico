package _Exemplos;

public class TesteFaculdade {

	public static void main(String[] args) {
		
		EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
		
		empregado.setNome("Aldo");
		empregado.setSalario(100);
		
		ProfessorDaFaculdade professor = new ProfessorDaFaculdade();
		
		professor.setNome("Ana");
		professor.setSalario(200);
		professor.setHorasDeAula(3);
		
		Reitor reitor = new Reitor();
		
		reitor.setNome("Ivo");
		reitor.setSalario(300);
		
		GeradorDeRelatorio gerador = new GeradorDeRelatorio();
		
		gerador.adiciona(empregado);
		gerador.adiciona(professor);
		gerador.adiciona(reitor);
		
	}
}
