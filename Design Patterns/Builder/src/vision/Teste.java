package vision;

import model.Funcionario;
import model.Pedido;

public class Teste {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		Funcionario funcionario = new Funcionario();
		
		 pedido = funcionario.montar("Hamburger", "Pequena", "Bonequinha", "Guaraná");
		 System.out.println(pedido.toString());
		
		
		
		
		
	}

}