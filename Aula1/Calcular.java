
public class Calcular {
	int resultado;
	
	void somar(int n1, int n2) {
		resultado = n1 + n2;
		
		System.out.println(n1 + " + " + n2 + " = "+ resultado + ".");
	}
	
	void multiplicar (int n1, int n2) {
		resultado = n1 * n2;
		System.out.println(n1 + " x " + n2 + " = "+ resultado + ".");
	}
	
	void dividir (int n1, int n2) {
		resultado = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = "+ resultado + ".");
	}
	
	void subtrair (int n1, int n2) {
		resultado = n1 - n2;
		System.out.println(n1 + " - " + n2 + " = "+ resultado + ".");
	}
}
