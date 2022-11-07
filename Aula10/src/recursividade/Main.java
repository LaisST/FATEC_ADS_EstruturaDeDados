package recursividade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Fatorial fatorial = new Fatorial();
		
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número para o fatorial: ");
		int n = ler.nextInt();
		System.out.println(fatorial.fatorialRecursivo(n));
		
		/////////////////////////////////////////////////////////////////
		
		SomaRecursiva soma = new SomaRecursiva();
		
		System.out.println("Digite um número para a soma: ");
		int num = ler.nextInt();
		System.out.println(soma.SomaRecursiva(num));
		
		

	}

}
