package Modelo;

public class Pessoa {
	
	public String sexo;
	public String nome;
	
	public Pessoa(String sexo, String nome) {
		super();
		this.sexo = sexo;
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
