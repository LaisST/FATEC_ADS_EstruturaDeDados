import java.util.Scanner;

public class Programa {
	//M�todo executor
	public static void main (String[]args) {

		//Instanciando as classes
		
		//Aluno
		Aluno a1 = new Aluno ();
		a1.mostrar();
		
		//Dobro
		/* 
		Dobro db = new Dobro();
			
		//M�todo de entrada de dados	
		Scanner ler = new Scanner (System.in);
		int x;
		
		System.out.println("Digite um n�mero: ");
		x=ler.nextInt();
		db.dobrar(x);
		*/
		
		//Calcular
		Calcular soma1 = new Calcular();
		Calcular multiplicar1 = new Calcular();
		Calcular dividir1 = new Calcular();
		Calcular subtrair1 = new Calcular();
		
		Scanner ler = new Scanner (System.in);
		int x;
		int y;
		int opcao;
		
		System.out.println("Digite o primeiro n�mero: ");
		x= ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		y=ler.nextInt();
		
		System.out.println("Qual opera��o voc� deseja realizar?\n[1] Soma\n[2] Multiplica��o\n[3] Divis�o\n[4] Subtra��o");
		opcao = ler.nextInt();
		
		if (opcao == 1) { soma1.somar(x, y); } 
		else if (opcao == 2) { multiplicar1.multiplicar(x, y);}
		else if (opcao == 3) { dividir1.dividir(x, y);} 
		else if (opcao == 4) { subtrair1.subtrair(x, y);}
		else {	System.out.println("Op��o Inv�lida!"); }
		
	}

}
