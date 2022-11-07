package Fila;

public class Main {
	
	public static void main(String[] args) {
		
		Filas numeros1 = new Filas();
		Filas num = new Filas();

		numeros1.adicionar(7);
		numeros1.adicionar(6);
		numeros1.adicionar(5);
		numeros1.adicionar(0);
		numeros1.mostrar();
		numeros1.remover();
		numeros1.mostrar();

		
		num.adicionar(5);
		num.adicionar(4);
		
		num.mostrar();
		
		num.remover();
		
		num.mostrar();
	}

}
