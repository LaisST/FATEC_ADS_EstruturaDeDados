package Exercicio1;

public class Numero {

	private int numero;
	
	Numero() {
		
	}
	
	Numero(int numero){
		this.numero=numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Numero [numero=" + numero + "]";
	}
	
	
}
