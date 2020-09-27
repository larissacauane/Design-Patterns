package Modelo;

public class FactoryGenero {
	
	public FactoryGenero() {}
	
	public Pessoa getGenero(String sexo, String nome) {
		
		if (sexo.equals("F"))
			return new Feminino("F", nome);
		
		else if(sexo.equals("M"))
			return new Masculino("M", nome);
		
		else if(sexo.equals("E"))
			return new Especial("E", nome);
		
		else return null;
		
		
		
		
		
	}

}
