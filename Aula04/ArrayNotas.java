import javax.swing.JOptionPane;

public class ArrayNotas {
	
	public void ColetarNotas(){
	
		double [] notas = new double[5]; //Declaração do vetor Nota
		String [] nomes = new String[5]; //Declaração do vetor Nome
		int i; //controle do laço
		Double maior = 0.0;
		String AlunoMaior = "";
		Double menor = 10.0;
		String AlunoMenor = "";
		
		for (i=0;i<nomes.length;i++) {
			//inserir dados
			nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno: ");
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota para o aluno: "));
		}	

		for(i=0;i<notas.length;i++) {
			if(notas[i]> maior) {
				maior = notas[i];
				AlunoMaior = nomes[i];
			}else if(notas[i] < menor) {
				menor = notas[i];
				AlunoMenor = nomes[i];
			}
		}
		
		
		for(i=0;i<notas.length;i++) {
			System.out.println("Aluno(a): "+nomes[i]+ " - Nota: "+notas[i]);
		}
		System.out.println("A maior nota foi do(a) aluno(a) "+ AlunoMaior + " - nota: "+ maior);
		System.out.println("A menor nota foi do(a) aluno(a) "+ AlunoMenor + " - nota: "+ menor);
	}
	
}
