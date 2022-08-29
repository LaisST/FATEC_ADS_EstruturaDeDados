package RepeticaoAtividade;

import java.util.Scanner;

public class Intervalo {
	
	public Intervalo(int n1, int n2) {
		// TODO Auto-generated constructor stub
	}

	public void contarPares(int n1, int n2) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n1= ler.nextInt(); 
		System.out.println("Digite outro número maior que  "+n1);
		n2= ler.nextInt();
		
		for (int i = n1; n1 < n2; i ++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
	}

}
