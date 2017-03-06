package cap04;

public class TestaEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Empresa empresa = new Empresa(2);

	//
		empresa.empregados = new Funcionario[10];
		Funcionario f1 = new Funcionario();


//		Funcionario f1 = new Funcionario();
//		f1.setNome("Joao");
//		f1.setSalario(400);
////		f1.dataDeEntradaNoBanco = new Data();
////		f1.getDataDeEntradaNoBanco().ano = 2010;
////		f1.getDataDeEntradaNoBanco().mes = 12;
////		f1.getDataDeEntradaNoBanco().dia = 5;z
//		empresa.adciona(f1);
////		empresa.contem(f1);
//
//		/*Funcionario f1 = new Funcionario();
//		f1.setNome("Joao");
//		f1.setSalario(400);
//		*/
//		Funcionario f2 = new Funcionario();
//		f2.setNome("Marcos");
//		f2.setSalario(400);
////		f1.dataDeEntradaNoBanco = new Data();
//		empresa.adciona(f2);
////		empresa.contem(f2);

//		for (int i = 2; i < 10; i++) {
//			Funcionario f = new Funcionario();
//			f.salario = i * 100;
//			empresa.adciona(f);
//		}

		//empresa.empregados[0].mostra();
		//empresa.empregados[1].mostra();


//		for(int i = 0; i < 10; i++){
//			//empresa.empregados[i].mostra();
//		}

//		empresa.mostraEmpregados(empresa.empregados );

		for(int i = 0; i < 10; i++){
			f1.nome = "Cleitosn";
			f1.departamento = "Desenvolvimento";
			f1.salario = 1000 + i * 100;
//			f1.entradaBanco = new Data();
//			f1.entradaBanco.preencheData(12,6,1984);
			f1.RG = "378917239871";
			empresa.adiciona(f1);
		}
		System.out.println(empresa.empregados.length);
		System.out.println(empresa.contem(f1));




	}

}
