package model;

public class IncrementalSingleton {
	
	private static int count = 0;
    private int numero;
	
	private static IncrementalSingleton instance;
	
	
	private IncrementalSingleton() {
		numero = ++count;
	}
	
	public static IncrementalSingleton getIncrementalSingleton() {
		if(instance == null) {
			synchronized (IncrementalSingleton.class) {
				if(instance == null)
					instance = new IncrementalSingleton();
			}
		}
		return instance;
	}
	

	public String toString() {
          return "Incremental " + numero;
	 }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	
}
