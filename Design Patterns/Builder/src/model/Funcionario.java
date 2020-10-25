package model;

public class Funcionario {
	
	public Atendente atendente;
	
	public Pedido montar(String sanduiche, String batata, String brinquedo, String refrigerante) {
		
		atendente = new AtendenteMontar();
		
		atendente.montarDentroDaCaixa(sanduiche, batata, brinquedo);
		atendente.montarForaDaCaixa(refrigerante);
		return atendente.getPedido();
	}
	

}
