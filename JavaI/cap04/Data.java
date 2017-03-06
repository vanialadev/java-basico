package cap04;

public class Data {

	int dia;
	int mes;
	int ano;

	public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

				getFormatada();
    }


	void preencheAData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getFormatada() {
		if (! isDataViavel(dia, mes, ano)) {
				return "A data " + this.dia + "/" + this.mes + "/" + this.ano + " nao existe!";
		} else {
			return "A data " + this.dia + "/" + this.mes + "/" + this.ano + " existe!";
		}
	}
	private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0 || mes > 12 || ano <= 0) {
            return false;
        }

        int ultimoDiaDoMes = 31; // por padrao s�o 31 dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            ultimoDiaDoMes = 28;
            if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                ultimoDiaDoMes = 29;
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }

        return true;
    }

	public static void main(String[] args) {

		Data data = new Data(12,12,2015);

		//System.out.println(data.isDataViavel(25, 2, 2012));;
		System.out.print(data.getFormatada());;
	}
}
/*	public boolean isDataViavel(String dia, String mes, String ano){
		//if(dia.compareTo("0") == 0 || dia.compareTo("32") ){

		//}



		if(mes.equals("1") || mes.equals("3") || mes.equals("5")|| mes.equals("7") || mes.equals("8") || mes.equals("10") || mes.equals("12")){

		}

		return false;
	}*/


/*	public static void main(String[] args) {

		String ano = "10";

		if(ano.equals("10")){
			System.out.println("Olha s�");
		}else{
			System.out.println("erro");
		}
		int dia;
		dia = ano.compareTo("0");
		if(dia>0)
			System.out.println("ano � maior");
		if(dia==0)
			System.out.println("igual");
		if(dia < 0)
			System.out.println("ano � menor");

		if(ano.compareTo("31") < 0){
			System.out.println("1");
		}
		if(ano.compareTo("10") == 0){
			System.out.println("2");
		}
		if(ano.compareTo("9") > 0){
			System.out.println("3");
		}

	}*/
