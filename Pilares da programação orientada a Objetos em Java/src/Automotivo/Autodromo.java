package Automotivo;

public class Autodromo {

	public static void main(String[] args) {
		carro jeep = new carro();
		jeep.setChassi("1548762");
		jeep.ligar();
		
		moto z400 = new moto();
		z400.setChassi("654458");
		z400.ligar();
		
	
	
	veiculo coringa = z400;
	
	coringa.ligar();
	}

}
