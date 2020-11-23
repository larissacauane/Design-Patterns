package view;

import controller.Cliente;
import model.Adaptador;
import model.SomadorEsperado;
import model.SomadorExistente;

public class AdapterDemo {
	public static void main(String[] args) {
		SomadorEsperado soma = new Adaptador();
		Cliente c = new Cliente(soma);
		c.excutar();
		
		
	}

}
