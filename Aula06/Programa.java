import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Caracteres caracteres1 = new Caracteres(4);
		caracteres1.adicionar('L');
		caracteres1.adicionar('a');
		caracteres1.adicionar('i');
		caracteres1.adicionar('s');
		System.out.println(caracteres1.concatenar());
		
		//Opção com entrada

		System.out.println("Quantas letras tem o seu nome?");
		Scanner ler = new Scanner(System.in);
		int nrItens = ler.nextInt();
		Caracteres caracteres2 = new Caracteres(nrItens);
		
		Scanner lerLetra = new Scanner(System.in);
		int i = 1;
		while (i <= nrItens) {
		System.out.println("Digite a "+i+"ª Letra: ");
			char c = lerLetra.next().charAt(0);
			caracteres2.adicionar(c);
			i++;
		}
		System.out.println(caracteres2.concatenar());
	
		
		ListaString frase1 = new ListaString(50);
		
		frase1.adicionarPalavra("LAIS");
		frase1.adicionarPalavra("COSTA");
		frase1.adicionarPalavra("SANTOS");
		frase1.adicionarPalavra("TEIXEIRA");
		
		System.out.println(frase1.concatenarPalavra());
		
		//Opção com entrada
		
		System.out.println("Quantas palavras tem o seu nome?");
		Scanner ler1 = new Scanner(System.in);
		int qtdeItens = ler1.nextInt();		
		ListaString frase2 = new ListaString(qtdeItens);
		
		Scanner lerLetra1 = new Scanner(System.in);
		i = 1;
		while (i <= qtdeItens) {
		System.out.println("Digite a "+i+"ª palavra: ");
			String palavra = lerLetra1.next();
			frase2.adicionarPalavra(palavra);
			i++;
		}
		System.out.println(frase2.concatenarPalavra());
			
	}
	
	
	
	

}
