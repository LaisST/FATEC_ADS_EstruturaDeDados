import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		String sexo;
		String resposta;
		int entrevistados = 0;
		double masculino = 0;
		double feminino = 0;
		double MascSim = 0;
		double MascNao = 0;
		double FemSim = 0;
		double FemNao = 0;
		double Perc;
		
		while (entrevistados < 10){
			System.out.println("Qual o seu sexo?\n[F] Feminino\n[M] Masculino");
			Scanner ler = new Scanner(System.in);
			sexo = ler.next();
			
			System.out.println("Gosta do novo produto?\n[S] Sim\n[N] N�o");
			Scanner ler2 = new Scanner(System.in);
			resposta = ler2.next();
			
			if (sexo.equals("F") ) {
				feminino ++;
				if (resposta.equals("S") ) { FemSim ++;	}
				else if(resposta.equals("N")){ FemNao ++; }
				
			}else if(sexo.equals("M")){
				masculino ++;
				if (resposta.equals("S") ) { MascSim ++;}
				else if(resposta.equals("N")){	MascNao ++;	}
			}
				
			entrevistados ++;
		}
		
		
		Perc = (MascNao / masculino)*100;
		System.out.println("O n�mero de pessoas que respondeu sim: "+ ((FemSim + MascSim)));
		System.out.println("O n�mero de pessoas que respondeu n�o: " + (FemNao + MascNao));
		System.out.println("O n�mero de mulheres que respondeu sim: " + (FemSim));
		System.out.println("A percentagem de homens que respondeu n�o entre todos os homens analisados: " + Perc) ;
						
	}
}
