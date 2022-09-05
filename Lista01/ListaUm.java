import java.util.Scanner;

public class ListaUm {

	public static void main(String[] args) {
		int voto;
		int JairRodrigues = 0;
		int CarlosLuz = 0;
		int NevesRocha = 0;
		double Nulo = 0;
		double Branco = 0;
		double total = 0;
		String vencedor = " ";
		
		do{
			System.out.println("====ELEIÇÕES====");
			System.out.println("[1] - Candidato Jair Rodrigues\n[2] - Candidato Carlos Luz\n[3] - Candidato Neves Rocha\n[4] - Nulo\n[5] - Branco");
			Scanner ler = new Scanner(System.in);
			System.out.println("Entre com o seu Voto: ");
			voto = ler.nextInt();
			
			if (voto == 1) {JairRodrigues ++;}
			else if (voto == 2) {CarlosLuz ++;}
			else if (voto == 3) {NevesRocha ++;}
			else if (voto == 4) {Nulo ++;}
			else if (voto == 5) {Branco ++;}
			else if (voto == 6) { }
			
			total ++;
		}while (voto != 6);
		
		if (JairRodrigues > CarlosLuz && JairRodrigues > NevesRocha  ) { vencedor = "Jair Rodriguês";}
		else if ( CarlosLuz > JairRodrigues && CarlosLuz > NevesRocha  ) { vencedor = "Carlos Luz";}
		else if ( NevesRocha > JairRodrigues && NevesRocha > CarlosLuz ) { vencedor = "Neves Rocha";}
		
		System.out.println("O número de votos de cada candidato:");
		System.out.println("[1] - Candidato Jair Rodrigues: " + JairRodrigues + "\n[2] - Candidato Carlos Luz: " + CarlosLuz + "\n[3] - Candidato Neves Rocha: " + NevesRocha);
		System.out.println("A porcentagem de votos nulos: " + ((Nulo/total)*100));
		System.out.println("A porcentagem de votos Brancos: " + ((Branco/total)*100));
		System.out.println("O vencedor é " + vencedor + "!!");
	}
}
	
	
