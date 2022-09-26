package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaFrutas {
	/*
	ArrayList<String>frutas = new ArrayList();
	Scanner ler = new Scanner(System.in);
	
	public void adicionar(){
		for(int i =1; i <= 5;i++) {
		System.out.println("Qual a sua "+i+"ª fruta favorita?");
		String f = ler.next();
		frutas.add(f);
		}
		
		System.out.println("Lista de frutas favoritas: "+frutas);
	}*/
	
	String[] lista; 
	int nrItens;  
	int tamanho;  
	
	//Construtor com parametro
	ListaFrutas(int nrItens){
		this.tamanho = 0; 
		this.nrItens = nrItens; 
		lista = new String[nrItens]; 
	}
	
	//Métodos
	public void adicionarFrutas(String fruta) {
		lista[tamanho] = fruta;
		tamanho ++; //contador Tamanho
	}

	public String concatenarFrutas() {
		String f="Lista: ";
		for(int i=0; i < tamanho; i++) { f = f +" - "+lista[i]; }
		return f;
	}
	
	//Getters
	public int getTamanho() { return this.tamanho; }
	public int getNrItens() { return this.nrItens; }
	
}
