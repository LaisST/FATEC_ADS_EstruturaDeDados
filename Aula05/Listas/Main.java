package Listas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Numeros lista = new Numeros(4);
        //lista.adicionar(8); // index 0
		//lista.adicionar(7); // index 1
		//lista.adicionar(6); // index 2
		
		int n;
		int cont = 0;
		while(cont < 4) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um número para a lista: ");
			n = ler.nextInt();
			lista.adicionar(n);
			cont ++;
		}
		System.out.println("procurando 3 na lista -> Resultado indice = "+ lista.pesquisar(3));
		lista.imprimir();
	}
}
