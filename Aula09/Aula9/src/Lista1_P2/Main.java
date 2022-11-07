package Lista1_P2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Pacientes consultas = new Pacientes();
		
		Scanner ler = new Scanner(System.in);
		
		
		int opcao = 1;
		int cont = 0;
		System.out.println("CONSULTÓRIO DR. FÁBIO");
		System.out.println("Quantas pessoas podem ser atendidas hoje?");
		consultas.tamanho = ler.nextInt();
		System.out.println("");
		
		
		do {
			System.out.println("[1] - CADASTRAR PACIENTE\n[2] - CHAMAR PACIENTE\n[3] - INFORMAR O PRÓXIMO PACIENTE A SER ATENDIDO\n[4] - QUANTIDADE DE PACIENTES NA FILA\n[0] - SAIR");
			opcao = ler.nextInt();
			
			if(opcao == 1) {
				if(cont < consultas.tamanho) {
				System.out.println("\nNome do Paciente (não utilize espaço): ");
				String paciente = ler.next();
				consultas.adicionar(paciente);
				cont ++;
				}else {
					System.out.println("Não há vagas");
				}
				
			}else if (opcao == 2) {
				System.out.println("\nPACIENTE");
				consultas.chamar();
				System.out.println("SALA 1");
				System.out.println("");

			} else if(opcao == 3) {
				System.out.println("\nPRÓXIMO PACIENTE: ");
				consultas.proximo();
				System.out.println("");
				
			} else if(opcao == 4) {
				consultas.mostrar();
				System.out.println("");
				
			} else if(opcao >= 5) {
				System.out.println("\nOpção inválida");
				System.out.println("");
				
			}
			
		}while(opcao != 0 );
		
		System.out.println("\nConsultas finalizadas!");

	}

}
