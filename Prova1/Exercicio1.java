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
		
		System.out.printf("Digite uma posi��o:" );
		x = ler.nextInt();
		
		System.out.printf("Digite outra posi��o:" );
		y = ler.nextInt();
		
		
		System.out.println("A soma � igual a " + (vetorUm[x]+vetorUm[y]));

	}

}