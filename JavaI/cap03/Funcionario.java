package cap03;

public class Funcionario {

	String nome;
	String departamento;
	double salario;
	Data dataDeEntradaNoBanco;
	String RG;
	String telefone;
	boolean ponto;
	

	void recebeAumentoDePorcentagem(int porcentagem) {
		
		this.salario += salario * porcentagem/100;
	}
	
	double calculaGanhoAnual(){
		
		return this.salario * 12;
	}
	
	void bateOPonto(){
		this.ponto = true;
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
//		System.out.println("Data de Entrada: " + this.dataDeEntradaNoBanco);
		System.out.println(this.dataDeEntradaNoBanco.dia + "/" + this.dataDeEntradaNoBanco.mes + "/" + this.dataDeEntradaNoBanco.ano);;
		System.out.println("Data formatada: " + this.dataDeEntradaNoBanco.getFormatada());
		System.out.println("Rg: " + this.RG);
		System.out.printf("Sal�rio: R$%4.2f\n", this.salario);
		System.out.printf("Ganho Anual: R$%4.2f\n", this.calculaGanhoAnual());
		System.out.println("Bateu o Ponto? " + this.ponto);
	}
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		f.dataDeEntradaNoBanco = new Data();
		
		f.nome = "Vania";
//		f.dataDeEntradaNoBanco = "10/10/2010";
		f.departamento = "RH";
		f.RG = "1235689";
		f.salario = 100;
		f.bateOPonto();
		f.recebeAumentoDePorcentagem(10);
		System.out.println(f.salario);
/*		f.dataDeEntradaNoBanco.dia = 10;
		f.dataDeEntradaNoBanco.mes = 10;
		f.dataDeEntradaNoBanco.ano = 2010;*/
		f.dataDeEntradaNoBanco.preencheAData(10, 10, 2010);
		f.mostra();
	
		
		Funcionario f1 = new Funcionario();
		//Funcionario f2 = new Funcionario();
		Funcionario f2 = f1;
		
		f1.nome = "Danilo";
		f2.nome = "cARLOS";
		f1.salario = 100;
		f2.salario = 100;
		
		if(f1 == f2){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}
		
		System.out.println(f1.nome);
	}

	//se chamar um atributo antes de atribuir ele lan�a o valor padrao
}
