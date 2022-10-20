import java.util.Scanner;

public class Main {



   public static void main(String[] args) {
	   Scanner ler = new Scanner(System.in);
	   int opcao = 0;
	   Exercicio1 listaTarefas1 = new Exercicio1(1);
	   
	   do {
	   System.out.println("==LISTA DE TAREFAS==\n[1] - Cadastrar tarefa\n[2] - Pesquisar tarefa\n[3] - Mostrar Lista\n[4] - Sair");
	   opcao = ler.nextInt();
		   if (opcao == 1) {
			   System.out.println("Digite a tarefa (Não utilize espaços):");
			   String tarefa = ler.next();
			   listaTarefas1.adicionar(tarefa);
			   
		   } else if (opcao == 2) {
			  System.out.println("Qual tarefa deseja pesquisar?");
			  String tarefa = ler.next();
			  int achou = listaTarefas1.pesquisar(tarefa);
			  if (achou == 1) {
				  System.out.println("Ok. Item Localizado!");
				  
			  } else if (achou == 2){
				  listaTarefas1.adicionar(tarefa);
				  System.out.println("Item não encontrado.\nTarefa incluida com sucesso!");
			  }
			  
		   } else if (opcao == 3) {
			   System.out.println("Lista de tarefas");
			   System.out.println(listaTarefas1.concatenar());
			   
		   } else if (opcao == 4){
			   System.out.println("Finalizado");
		   }
		   System.out.println(" ");
	   }while (opcao != 4);
	  
	   System.out.println("Lista de tarefas");
       System.out.println(listaTarefas1.concatenar());
       
    }
   
}
