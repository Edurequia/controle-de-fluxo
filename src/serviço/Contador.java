package serviço;

import exceptions.ParametroInvalidoException;

public class Contador {
	
	public void contar(int p1, int p2) throws ParametroInvalidoException {
		
		int contagem = p2 - p1;
		
		if (p1 > p2) {
			throw new ParametroInvalidoException();
		} 
		else {
			for (int i=1; i<=contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}
}
	
}
