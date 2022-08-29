package Repeticao;

import java.util.Scanner;

//Derivado do while, mas executa pelo menos uma vez.
/*
 do{
 \\Comando;
 }while(condição);
 */

public class DoWhile {

	public static void main(String[] args) {
		int opcao;
		
		do {
			Scanner ler = new Scanner(System.in);
			System.out.println("[0] - Cadastrar\n[1] - Consultar");
			opcao = ler.nextInt();
			if (opcao > 1) { System.out.println("Opção inválida!\nTente novamente.");}
			
		}while(opcao > 1);
		System.out.println("Finalizado");
	}

}
