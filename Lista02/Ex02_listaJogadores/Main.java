import java.util.Scanner;

public class Main {



   public static void main(String[] args) {
	   Scanner ler = new Scanner(System.in);

        //Adicionar Jogadores
	   System.out.println("Quantos jogadores deseja incluir? ");
	   int qtdeJogadores = ler.nextInt();
	   Selecao listaJogadores = new Selecao(qtdeJogadores);
	   
	   for (int i = 0; i < qtdeJogadores;i++){
	        System.out.println("Digite o nome do jogador (não utilize espaço):");
			String jogador = ler.next();
			listaJogadores.adicionar(jogador);
	   }
	   
	   //Pesquisar Jogador 
	   System.out.println("Qual jogador deseja pesquisar?");
	   String jogador = ler.next();
	   String retorno = listaJogadores.pesquisar(jogador);
	   System.out.println(retorno);
	   
	   //Mostrar Lista
	   System.out.println(" ");
	   System.out.println("Lista de Jogadores");
       System.out.println(listaJogadores.concatenar());
       
    }
   
}
