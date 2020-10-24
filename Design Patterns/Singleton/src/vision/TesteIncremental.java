package vision;


import model.IncrementalSingleton;

public class TesteIncremental {
		public static void main(String[] args) {
			
			for (int i = 0; i < 10; i++) {
				IncrementalSingleton inc = IncrementalSingleton.getIncrementalSingleton();
				inc.setNumero(i);
				System.out.println(inc);
			}
	}

}
