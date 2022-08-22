package Ternario;

import java.util.Scanner;

public class Ternario {
	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o n1 ");
		n1= ler.nextInt();
		System.out.println("Digite o n2 ");
		n2= ler.nextInt();
		System.out.println("Digite o n3 ");
		n3= ler.nextInt();
		
		System.out.println((n1 < n2 && n1 < n3) ? "n1 é menor do que o n2 e n3 " 
				: (n2 < n1 && n2 < n3) ? "N2 é menor do que n1 e n3": "N3 é menor do que n1 e n2");
		

	}

}