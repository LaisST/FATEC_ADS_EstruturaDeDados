import javax.swing.JOptionPane;

public class MatrizABC {
	public void CalcularABC() {
		int [][] A = new int [3][3];
		int [][] B = new int [3][3];
		int [][] C = new int [3][3];
		int linha = 0;
		int coluna = 0;
		
		for(linha=0;linha< 3;linha++) {
			for(coluna=0; coluna<3;coluna++) {
				A[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a Matriz A: ")) ;
			}
		}
		
		for(linha=0;linha< 3;linha++) {
			for(coluna=0; coluna<3;coluna++) {
				B[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a Matriz B: ")) ;
			}
		}
		
		for(linha=0;linha< 3;linha++) {
			for(coluna=0; coluna<3;coluna++) {
				C[linha][coluna] = A[linha][coluna] * B[linha][coluna];
			}
		}
		
		System.out.println("\nMatriz A");
		for(linha=0; linha < 2; linha++) {
			for(coluna=0;coluna < 3; coluna++) {
				System.out.print(A[linha][coluna]);
				System.out.print(" | ");
				}
				if(linha<1) {System.out.println("\n-----------");}
			
		}
		System.out.println(" ");
		System.out.println("\nMatriz B");
		for(linha=0; linha < 2; linha++) {
			for(coluna=0;coluna < 3; coluna++) {
				System.out.print(B[linha][coluna]);
				System.out.print(" | ");
				}
				if(linha<1) {System.out.println("\n-----------");}
			
		}
		System.out.println(" ");
		System.out.println("\nMatriz C");
		for(linha=0; linha < 2; linha++) {
			for(coluna=0;coluna < 3; coluna++) {
				System.out.print(C[linha][coluna]);
				System.out.print(" | ");
				}
				if(linha<1) {System.out.println("\n-----------");}
			
		}
		
		
		
	}

}
