package RepeticaoAtividade;

import java.util.Scanner;

public class AtividadeWhile {
	
	public void somar(int n, int soma) {
		while (n != 0) {
			Scanner ler = new Scanner (System.in);
			System.out.println("Digite um número: ");
			n= ler.nextInt();
			soma = soma + n;
			
		}

		System.out.println("A soma dos números digitados é "+ soma);
		
		
	}
	
}



