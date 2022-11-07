package recursividade;

public class SomaRecursiva {
	
	public int SomaRecursiva(int numero) {
		if (numero ==0) { //Condição de parada
			return 0;
		} else {
			return numero+SomaRecursiva(numero-1);
		}
	}

}
