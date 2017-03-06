package cap04;

public class Funcionario {

	 String nome;
	 String departamento;
	 double salario;
//	Data dataDeEntradaNoBanco;
//	private Data dataDeEntradaNoBanco = new Data();
	 String RG;
	 String telefone;
	 boolean ponto;
	 static int proximoFuncionario = 0;
     int identificador;


	public int getIdentificador() {
		return identificador;
	}


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
	//	System.out.println(this.dataDeEntradaNoBanco.dia + "/" + this.dataDeEntradaNoBanco.mes + "/" + this.dataDeEntradaNoBanco.ano);;
	//	System.out.println("Data formatada: " + this.dataDeEntradaNoBanco.getFormatada());
		System.out.println("Rg: " + this.RG);
		System.out.printf("Salário: R$%4.2f\n", this.salario);
		System.out.printf("Ganho Anual: R$%4.2f\n", this.calculaGanhoAnual());
		System.out.println("Bateu o Ponto? " + this.ponto);

	}


		public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

		 public Funcionario(String nome) {
		        this.nome = nome;
		        this.identificador = proximoFuncionario++;
		    }



		public Funcionario(String nome, String departamento, double salario, Data dataDeEntradaNoBanco, String rG,
				String telefone, boolean ponto) {
			super();
			this.nome = nome;
			this.departamento = departamento;
			this.salario = salario;
	//		this.dataDeEntradaNoBanco = dataDeEntradaNoBanco;
			this.RG = rG;
			this.telefone = telefone;
			this.ponto = ponto;
		}


		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

	//	public Data getDataDeEntradaNoBanco() {
	//		return dataDeEntradaNoBanco;
	//	}
	//
	// void setDataDeEntradaNoBanco(Data dataDeEntradaNoBanco) {
	//		this.dataDeEntradaNoBanco = dataDeEntradaNoBanco;
	//	}

		public String getRG() {
			return RG;
		}

		public void setRG(String rG) {
			this.RG = rG;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public boolean isPonto() {
			return ponto;
		}

		public void setPonto(boolean ponto) {
			this.ponto = ponto;
		}




}
