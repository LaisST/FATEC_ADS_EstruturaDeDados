package recursividade;

public class Fatorial {
	public int fatorialRecursivo(int numero) {
		if (numero ==0) { //Condi��o de parada
			return 1;
		} else {
			return numero*fatorialRecursivo(numero-1);
		}
	}

}
