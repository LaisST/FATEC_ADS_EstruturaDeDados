package prova;

public class ListaLivros {

	String[] livro; 
	int qtdePalavras;  
	int indice;  
	
	ListaLivros(int qtdePalavras){
		this.indice = 0; 
		this.qtdePalavras = qtdePalavras; 
		livro = new String[qtdePalavras]; 
	}
	
	//Métodos
	public void adicionarPalavra(String palavras) {
		livro[indice] = palavras;
		indice ++; //contador Tamanho
	}
	
	public String concatenarPalavra() {
		String s="";
		for(int i=0; i < indice; i++) { s = s+" "+livro[i]; }
		return s;
	}
	
	//Getters
	public int getIndice() { return this.indice; }
	public int getQtdePalavras() { return this.qtdePalavras; }
}
