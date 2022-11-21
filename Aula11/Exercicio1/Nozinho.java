package Exercicio1;

public class Nozinho {
	
	private int valor; //Recebe os números
	private Nozinho proximo; // aponta para o proximo elemento
	
	
	
	//Getters and Setter
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Nozinho getProximo() {
		return proximo;
	}
	public void setProximo(Nozinho proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
		return "Nozinho [valor=" + valor + ", proximo=" + proximo + "]";
	}
	
	

}
