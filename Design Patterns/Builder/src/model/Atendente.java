package model;

public interface Atendente {
	
	public Pedido getPedido();

	public void montarDentroDaCaixa(String sanduiche, String batata, String brinquedo);

	public void montarForaDaCaixa(String refrigerante);
}
