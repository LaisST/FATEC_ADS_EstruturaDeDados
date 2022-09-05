import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		int lado;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tamanho do lado do quadrado: ");
		lado = ler.nextInt();
		int c = 1;
		
		while (c <= lado) {
			System.out.print("*");
			c++;
			
		}
	


	}
	
}
