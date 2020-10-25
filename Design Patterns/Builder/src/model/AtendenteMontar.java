package model;

public class AtendenteMontar implements Atendente{
	
	Pedido pedido = new Pedido();
	
	@Override
	public void montarDentroDaCaixa(String sanduiche, String batata, String brinquedo) {
		pedido.adicionarDentroDaCaixa(sanduiche);
		pedido.adicionarDentroDaCaixa(batata);
		pedido.adicionarDentroDaCaixa(brinquedo);
	}

	@Override
	public void montarForaDaCaixa(String refrigerante) {
		pedido.adicionarForaDaCaixa(refrigerante);
	}
	
	@Override
	public Pedido getPedido() {
		return pedido;	
	}

}
