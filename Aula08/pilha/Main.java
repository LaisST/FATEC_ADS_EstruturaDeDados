package pilha;

public class Main {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(3);
		
		pilha.empilhar(3);
	    pilha.empilhar(6);
		pilha.empilhar(9);
		
		System.out.println(pilha.toString());
		
		pilha.desempilhar();
		
		System.out.println(pilha.toString());
		
		pilha.desempilhar();
		
		System.out.println(pilha.toString());
		
		pilha.desempilhar();
		
		System.out.println(pilha.toString());
		
		pilha.desempilhar();
		
		pilha.desempilhar();
		
	
		

	}

}
