package prova;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int[] vetorDois = new int [5];
		int maior = 0;
		int menor = 1000;
		int Pmaior = 0, Pmenor = 0 ;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < vetorDois.length; i++) {
			System.out.printf("Digite um valor:" );
			vetorDois[ i ] = ler.nextInt();
		}
		
		for(int i = 0; i < vetorDois.length;i++) {
			if(vetorDois[i] > maior) {
				maior = vetorDois[i];
				Pmaior = i;
			}
			
			if(vetorDois[i] < menor){
				menor = vetorDois[i];
				Pmenor = i;
			}
		}
		
		System.out.println("Posição "+Pmaior+" tem o maior valor ");
		System.out.println("Posição "+Pmenor+" tem o menor valor ");
		
	}

}