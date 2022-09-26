
public class ListaString {
	String[] lista; 
	int nrItens;  
	int tamanho;  
	
	//Construtor com parametro
	ListaString(int nrItens){
		this.tamanho = 0; 
		this.nrItens = nrItens; 
		lista = new String[nrItens]; 
	}
	
	//Métodos
	public void adicionarPalavra(String palavras) {
		lista[tamanho] = palavras;
		tamanho ++; //contador Tamanho
	}

	public String concatenarPalavra() {
		String s="";
		for(int i=0; i < tamanho; i++) { s = s+" "+lista[i]; }
		return s;
	}
	
	//Getters
	public int getTamanho() { return this.tamanho; }
	public int getNrItens() { return this.nrItens; }
	
	
	

}
