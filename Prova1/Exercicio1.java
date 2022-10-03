package prova;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int[] vetorUm = new int [8];
		int x, y;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < vetorUm.length; i++) {
			System.out.printf("Digite um valor :" );
			vetorUm[ i ] = ler.nextInt();
		}
		
		System.out.printf("Digite uma posição:" );
		x = ler.nextInt();
		
		System.out.printf("Digite outra posição:" );
		y = ler.nextInt();
		
		
		System.out.println("A soma é igual a " + (vetorUm[x]+vetorUm[y]));

	}

}