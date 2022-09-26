//Classe para fazer a lista de caracteres

public class Caracteres {
	char[] lista; //Declaração da lista vazia
	int nrItens;  //Declaração do número de Itens
	int tamanho;  //Declaração do tamanho da lista
	
	//Construtor com parametro que recebe o número de itens
	Caracteres(int nrItens){
		this.tamanho = 0; // Tamanho inicial 0
		this.nrItens = nrItens; // recebe o valor que o usuario digitar quando chamar o construtor
		lista = new char[nrItens]; //Cria a lista 
		
	}
	
	//Método para adicionar caracteres	
	public void adicionar(char c) {
		lista[tamanho] = c;
		tamanho ++; //contador Tamanho
	}

	//Método para concatenar
	public String concatenar() {
		String s="";
		for(int i=0; i < tamanho; i++) { s = s+ lista[i]; }
		return s;
	}
	

	
	//Getters
	public int getTamanho() { return this.tamanho; }
	public int getNrItens() { return this.nrItens; }
	
}
