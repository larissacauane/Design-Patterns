package Visao;

import Modelo.FactoryGenero;
import Modelo.Pessoa;

public class Cliente {

	public static void main(String[] args) {
		
		FactoryGenero fabrica = new FactoryGenero();
		
		Pessoa p = fabrica.getGenero("F", "Larissa");
		
		
		
		
		
		
	}

}
