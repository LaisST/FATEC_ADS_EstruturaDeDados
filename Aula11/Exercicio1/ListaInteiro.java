package Exercicio1;

import listaEncadeada.Contato;
import listaEncadeada.No;

public class ListaInteiro {
	
	private int tamanho;	
	private Nozinho primeiro;	
	
	public ListaInteiro() {	
		tamanho=0;
		primeiro=null;
	}
	
	
	public void adicionar (int i) {	
	
		Nozinho novo = new Nozinho();
		novo.setValor(i);
		novo.setProximo(primeiro);

		primeiro = novo;
	}
		
	
	
	
	public void print() {	//Metodo para percorrer nossa lista e mostrar na tela
		for (Nozinho no=primeiro;no!=null;no=no.getProximo()) {
			System.out.println(no.getValor());
		}
	}
	
}