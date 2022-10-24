package exercicioPilha;


public class PilhaLivros {
	String livros[]; 
	int topo; 
	

	
	//Construtor
	PilhaLivros(int qtdLivros){
		topo=-1; 
		livros = new String [qtdLivros];

	}
	
	//M�todo para verificar se a pilha est� cheia
	public boolean cheia() {
		return (topo == (livros.length-1));
	}
	
	
	//M�todo para verificar se a pilha est� vazia
	public boolean vazia() {
		return (topo == -1);
	}
	
	//M�todo Empilhar
	public void empilhar(String receberLivro) {
		if (!cheia()) { // Se o cheia for false
			topo ++;
			livros[topo] = receberLivro;
		
		}else { // se for vdd
			System.out.println("pilha cheia!");
		}
	}
	
	//M�todo para exibir bonitinho
	public String toString() {
		String s = "[";
		for (int i = 0 ; i <= topo; i++) {
			s = s + livros[i];
			if (i < topo)
				s = s + ", ";}
		
		s = s + "]";
		
		return s;
		
	}
	
	//desempilhar
	public String desempilhar() {
		String valor= null;
		if(!vazia()) {
			valor= livros[topo];
			livros[topo] = "";
			topo --;
		} else {
			System.out.println("Pilha vazia!");
		}
		return valor;
	}
	
	
	

}

	


