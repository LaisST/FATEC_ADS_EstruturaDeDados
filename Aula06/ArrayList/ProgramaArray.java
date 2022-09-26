package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaArray {

	public static void main(String[] args) {
		
		ListaFrutas lista1 = new ListaFrutas(5);
		Scanner ler = new Scanner(System.in);
		int i = 1;
		while (i <= 5) {
		System.out.println("Digite a sua "+i+"ª fruta favorita: ");
			String fruta = ler.next();
			lista1.adicionarFrutas(fruta);
			i++;
		}
		
		System.out.println(lista1.concatenarFrutas());
		
	}
}
