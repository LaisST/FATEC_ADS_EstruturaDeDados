package Metodo;

import java.util.Scanner;

//Metodo executor
public class Metodo {

	public static void main(String[] args) {

		Calculo calculo1 = new Calculo();
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um n�mero par ");
		int n1Par= ler.nextInt();
		System.out.println("Digite outro n�mero par ");
		int n2Par= ler.nextInt();
		System.out.println("Digite um n�mero impar ");
		int n1Impar= ler.nextInt();
		System.out.println("Digite outro n�mero impar ");
		int n2Impar= ler.nextInt();
		
		System.out.println("A soma do maior valor par com o maior valor impar � " + calculo1.soma(calculo1.maior(n1Par, n2Par), calculo1.maior(n1Impar, n2Impar)));
		
		//System.out.println("O valor maior � " + calculo1.maior(n1,n2));
		
		// calculo1.maior(n1,n2);
		

	}

}
