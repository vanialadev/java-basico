package cap04;


public class Empresa {

	@SuppressWarnings("unused")
	private String nome;
	@SuppressWarnings("unused")
	private String cnpj;
//	Funcionario[] empregados;
	public Funcionario[] empregados;
	private int livre = 0;




	public Empresa(int empregados) {
		this.empregados = new Funcionario[empregados];
	}


	void adiciona(Funcionario f){
		this.empregados[livre] = f;
		this.livre++;
	}

	void mostraEmpregados(Funcionario[] funcionarios) {

	    for (Funcionario funcionario: funcionarios) {
	            System.out.println("Funcion�rio " + funcionario.getNome());
	            System.out.println(funcionario.getSalario());
	        }
	    }


	void mostraTodasAsInformacoes() {
	    for (int i = 0; i < this.livre; i++) {
	        System.out.println("Funcion�rio na posi��o: " + i);
	        this.empregados[i].mostra();
	    }
	}

	boolean contem(Funcionario f) {
		for(int i = 0; i < this.livre; i++ ){
			if(this.empregados[i] == f){
				System.out.println("EWFRF");
				return true;
			}
		}

       return false;
    }

}
