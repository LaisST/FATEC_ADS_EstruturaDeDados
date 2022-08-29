package Notas;

public class Final {

	public static void main(String[] args) {
		int aluno = 0, aprovado = 0;
		double nota = 0, media= 0, maior= 0, menor= 10;
		
		CalculoNota sala1 = new CalculoNota();		
		sala1.Calcular(aluno, nota, maior, menor, media , aprovado);

	}

}
