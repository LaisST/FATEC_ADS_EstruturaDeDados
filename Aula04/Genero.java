import javax.swing.JOptionPane;

public class Genero {
	public void Apresentargenero() {
		String pessoas[][] = new String [5][2];
		int linha;
		int coluna;
		
		
		for(linha=0; linha < 5; linha++) {
			for(coluna=0;coluna < 2 ; coluna++) {
				if (coluna == 0) {
					pessoas[linha][coluna] = JOptionPane.showInputDialog("Digite o nome: ") ;
				}else if(coluna == 1) {
					pessoas[linha][coluna] = JOptionPane.showInputDialog("Digite o sexo: ") ;
				}
			}
		}
		for(linha=0; linha < 5; linha++) {
			for(coluna=0;coluna < 2; coluna++) {
				if(coluna == 0) { System.out.print("Nome: " + pessoas[linha][coluna]);}
				else if (coluna == 1){System.out.print(" - Sexo: " + pessoas[linha][coluna]);}
			}
			System.out.println(" ");
		}
	}

}
