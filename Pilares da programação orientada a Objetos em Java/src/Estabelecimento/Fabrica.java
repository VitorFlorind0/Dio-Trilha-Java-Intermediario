package Estabelecimento;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Impressora.Deskjet;
import Interface.Equipamentos.Impressora.Impressora;
import Interface.Equipamentos.Impressora.Lasejet;
import Interface.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {

	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}

}
