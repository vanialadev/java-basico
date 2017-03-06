package cap02;

public class BalancoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000; 
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastosTrimestre/3;
		
        System.out.println("Gasto do trimestre: R$" + gastosTrimestre);

		System.out.println("media " + mediaMensal);
	}

}
