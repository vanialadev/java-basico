package cap03;

public class Data {

	int dia;
	int mes;
	int ano;

	void preencheAData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String getFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;

	}
}
