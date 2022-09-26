//Classe para fazer a lista de caracteres

public class Caracteres {
	char[] lista; //Declara��o da lista vazia
	int nrItens;  //Declara��o do n�mero de Itens
	int tamanho;  //Declara��o do tamanho da lista
	
	//Construtor com parametro que recebe o n�mero de itens
	Caracteres(int nrItens){
		this.tamanho = 0; // Tamanho inicial 0
		this.nrItens = nrItens; // recebe o valor que o usuario digitar quando chamar o construtor
		lista = new char[nrItens]; //Cria a lista 
		
	}
	
	//M�todo para adicionar caracteres	
	public void adicionar(char c) {
		lista[tamanho] = c;
		tamanho ++; //contador Tamanho
	}

	//M�todo para concatenar
	public String concatenar() {
		String s="";
		for(int i=0; i < tamanho; i++) { s = s+ lista[i]; }
		return s;
	}
	

	
	//Getters
	public int getTamanho() { return this.tamanho; }
	public int getNrItens() { return this.nrItens; }
	
}
