import javax.swing.JOptionPane;

public class SomaPares {
	public void SomarPares (){
	int [] numeros = new int [10]; //Criação do vetor
	int soma = 0;
	int i; //controle do laço
	
	for(i=0; i<numeros.length;i++) {
		numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:  "));
		
		if(i%2==0) {
			soma += numeros[i];
		}
		
	}
	System.out.print("Lista");
	for(i=0;i<numeros.length;i++) {
		System.out.print(" - " + numeros[i]);
	}
	System.out.println("\nA soma dos números nas posições pares é: "+soma);
	
	}
}
