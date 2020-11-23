package model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Adaptador implements SomadorEsperado{
	
	public SomadorExistente somadorExistente;
	
	public Adaptador() {
		this.somadorExistente = new SomadorExistente();
	}

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<>();
		for(int i : vetor) 
		 lista.add(i);
		 
		return somadorExistente.somaLista(lista);
			
	}
	
	
	
	

}
