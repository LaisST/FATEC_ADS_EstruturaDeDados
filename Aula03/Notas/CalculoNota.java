package Notas;

import java.util.Scanner;

public class CalculoNota {
	//
	
	public void Calcular(int aluno, double nota, double maior, double menor, double media, int aprovados) {
		while (aluno < 10) {
			Scanner ler = new Scanner (System.in);
			System.out.println("Digite a nota do "+ (aluno+1)  + "� Aluno: ");
			nota= ler.nextInt();
			//media
			if (nota > maior) { maior = nota;}
			if (nota < menor) { menor = nota;}
			if (nota >= 6) {aprovados ++;}
			media = media+nota;
			aluno ++;
			
		}
		System.out.println("A maior nota � : "+ maior);
		System.out.println("A menor nota � : "+ menor);
		System.out.println("A m�dia da sala �:  "+ (media/aluno));
		System.out.println("Tiveram " +aprovados+" Aprovados");
		
	}	

}
