package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ListaInteiro lista = new ListaInteiro();
		
		lista.adicionar(40);
		lista.adicionar(50);
		lista.adicionar(60);
		
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		lista.adicionar(n);
		
		lista.print();
		
		
		

	}

}
