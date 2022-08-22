package Metodo;

import java.util.Scanner;

//Metodo executor
public class Metodo {

	public static void main(String[] args) {

		Calculo calculo1 = new Calculo();
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o n1 ");
		int n1= ler.nextInt();
		System.out.println("Digite o n2 ");
		int n2= ler.nextInt();
		
		System.out.println("O valor maior é " + calculo1.maior(n1,n2));
		
		// calculo1.maior(n1,n2);
		

	}

}
