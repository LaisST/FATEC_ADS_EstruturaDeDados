package exercicioPilha;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantos livros deseja incluir?");
		int qtdLivros = ler.nextInt();
				
		PilhaLivros pilha = new PilhaLivros(qtdLivros);
		
		
		for (int i = 0; i < qtdLivros;i++) {
			System.out.println("Digite o nome do "+(i+1)+"º Livro (sem espaço): ");
			String livro = ler.next();
			pilha.empilhar(livro);
		}
		
		for(int i = 0; i < qtdLivros; i++) {
		System.out.println(pilha);
		pilha.desempilhar();
		}
		pilha.desempilhar();
	}

}
