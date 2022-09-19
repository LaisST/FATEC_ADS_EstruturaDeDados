import javax.swing.JOptionPane;

public class Matriz {
	
	public void somarMatriz(){
		int [][] matriz = new int [2][3];
		int soma=0;
		int linha = 0;
		int coluna = 0;
		
		for(linha=0; linha < 2; linha++) {
			for(coluna=0;coluna < 3; coluna++) {
			matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: ")) ;
			soma += matriz[linha][coluna];
			}
		}
		for(linha=0; linha < 2; linha++) {
			for(coluna=0;coluna < 3; coluna++) {
			System.out.print(matriz[linha][coluna]);
			System.out.print(" | ");
			}
			if(linha<1) {System.out.println("\n-----------");}
			
		}
		System.out.println("\nA soma dos valores da matriz é "+ soma);
		
	}
}
