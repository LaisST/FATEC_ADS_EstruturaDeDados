	/*
	 * PIlhas
	 * O primeiro elemento a entrar é o ultimo a sair.
	 * LIFO - last-in-first-out
	 * push: O primeiro nó (empilha)
	 * pop: O último nó (desempilha)
	 * 
	 * Estrutura
	 * - Criar a pilha
	 * - Empilhar os itens
	 * - Desempilhar 
	 * - Mostrar a pilha
	 * 
	 * Diferença entre pilha e lista: Na lista podemos remover qualquer item em qualquer ordem, na pilha precisamos remover conforme ordem de empilhamento*/
	
	/*Exemplo 01: Um entregador do Ifood precisa empilhar os pedidos na caixa de entrega*/
	// 1) Criar pilha,2) cheia,3) vazia, 4) empilha, 5) desempilha
package pilha;

public class Pilha {
	int pedidos[]; //Recebe os dados
	int topo; //Verifica o topo da lista
	
	//Construtor
	Pilha(int qtdPedidos){
		topo=-1; // Verificar se a pilha está vazia
		pedidos = new int [qtdPedidos]; //Pedido vai receber o valor que o usuário digitar
	}
	
	//Método para verificar se a pilha está cheia
	public boolean cheia() {
		return (topo == (pedidos.length-1));
	}
	
	
	//Método para verificar se a pilha está vazia
	public boolean vazia() {
		return (topo == -1);
	}
	
	//Método Empilhar
	public void empilhar(int receberPedido) {
		if (!cheia()) { // Se o cheia for false
			topo ++;
			pedidos[topo] = receberPedido;
		
		}else { // se for vdd
			System.out.println("pilha cheia!");
		}
	}
	
	//Método para exibir bonitinho
	public String toString() {
		String s = "[";
		for (int i = 0 ; i <= topo; i++) {
			s = s + pedidos[i];
			if (i < topo)
				s = s + ", ";}
		
		s = s + "]";
		
		return s;
		
	}
	
	//desempilhar
	public int desempilhar() {
		int valor=-1;
		if(!vazia()) {
			valor=pedidos[topo];
			pedidos[topo] = 0;
			topo --;
		} else {
			System.out.println("Pilha vazia!");
		}
		return valor;
	}
	

}
