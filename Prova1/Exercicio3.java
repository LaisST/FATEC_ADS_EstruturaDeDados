package prova;
import java.util.Scanner;

public class Exercicio3 {


		public static void main(String[] args) {
			int[][] matrizUm = new int [4][4];
			int maior = 0;
			int linhaMaior = 0;
			int colunaMaior = 0;
			
			Scanner ler = new Scanner(System.in);
			
			for(int linha = 0;linha < 4;linha ++) {
				for(int coluna = 0;coluna < 4;coluna ++){
					System.out.println("Digite um número: ");
					matrizUm[linha][coluna] = ler.nextInt(); 
					if (matrizUm[linha][coluna] > maior) {
						maior = matrizUm[linha][coluna];
						linhaMaior = linha;
						colunaMaior = coluna;
					}
					}
			}
			
			for(int linha=0; linha < 4; linha++) {
				for(int coluna=0;coluna < 4; coluna++) {
				System.out.print(matrizUm[linha][coluna]);
				System.out.print(" | ");
				}
				if(linha<3) {System.out.println("\n---------------");}
				
			}
			System.out.println("\nLinha "+linhaMaior+" Coluna "+colunaMaior+" tem o maior valor");
			
		}

	}


