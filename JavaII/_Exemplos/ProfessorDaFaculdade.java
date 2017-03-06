package _Exemplos;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	private int horasDeAula;

	double getGastos() {
		return this.getSalario() + this.horasDeAula * 10;
	}

	String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula;
		return informacao;
	}
	
	void setHorasDeAula(int horasDeAula){
		this.horasDeAula = horasDeAula;
	}
	
	// métodos de get, set e outros que forem necessários
}