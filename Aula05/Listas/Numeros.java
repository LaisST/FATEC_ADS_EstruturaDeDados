package Listas;

public class Numeros {
	int qtdItens; //Número de itens da lista
	int tamanho; //Tamanho da lista / quantos itens ocupam a lista
	
	int [] itens; 
	
	//Metodo Construtor, que constroe o objeto
	Numeros(int n){
		this.qtdItens=n; //this significa que esse elemento pertence a essa classe
		this.tamanho = 0;
		itens = new int [n];
	}
	

	public void adicionar(int n) {
		itens[tamanho] = n;
		tamanho++;
	}
	
	public int getNrItens() {
		return qtdItens;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void imprimir() {
		System.out.print("[");
		for(int i=0;i < getTamanho(); i++) {
			System.out.print(itens[i]);
			if(i < getTamanho() -1) {
				System.out.print(", ");
			} 
		}System.out.print("]\n");
	}

}
