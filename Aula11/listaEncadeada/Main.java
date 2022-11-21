package listaEncadeada;

public class Main {

	public static void main(String[] args) {
		Lista contato = new Lista();
		contato.adicionar(new Contato("Ana", "ana@gmail.com"));
		contato.adicionar(new Contato("Paulo", "paulo@gmail.com"));
		contato.adicionar(new Contato("Lais", "lais@gmail.com"));
		
		contato.print();

	}

}
