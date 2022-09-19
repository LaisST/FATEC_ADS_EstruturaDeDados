import javax.swing.JOptionPane;

public class RecebeImparPar {
	public void ReceberImparPar() {
		int [] numeros = new int [10];
		int i = 0;
		int n;
		
		while(i<numeros.length) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:  "));
			if(n%2==0 && i%2==0) {
				numeros[i] = n;
				i++;
			}else if(n%2!=0 && i%2!=0) {
				numeros[i] = n;
				i++;
			}else {
				JOptionPane.showMessageDialog(null,"Digite novamente! indice: "+i);	
			}
		}
		
		System.out.println("Pares");
		for(i=0;i<numeros.length;i++) {
			if(i%2==0) {
				System.out.println("["+i+"] - "+numeros[i]);
			}
		}
		System.out.println("\nImpares");
		for(i=0;i<numeros.length;i++) {
			if(i%2!=0) {
				System.out.println("["+i+"] - "+numeros[i]);
			}
		}
	}

}
