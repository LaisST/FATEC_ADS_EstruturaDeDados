	import java.util.Scanner;
	
public class PrazoVista {


		public static void main(String[] args) {
			int contador = 0;
			String codigo;
			int v;
			int p; 
			double valorCompra;
			double valorTotalVista = 0.0;
			double valorTotalPrazo = 0.0;
			double valorTotal = 0.0;
			
			while (contador < 10) {
				System.out.println("Qual a forma de pagamento?\n[V] - � Vista\n[P] - � Prazo");
				Scanner ler = new Scanner(System.in);
				codigo = ler.next();
				
				Scanner ler2 = new Scanner(System.in);
				System.out.println("Qual o valor da compra? ");
				valorCompra = ler.nextDouble();
				
				if (codigo.equals("V") ) { 
					valorTotalVista = valorTotalVista + valorCompra;
							
				}else if(codigo.equals("P")){  
					valorTotalPrazo = valorTotalPrazo + valorCompra;
					
					System.out.println("O valor da primeira presta��o: R$" + (valorCompra/3) );		
				}
				contador ++;
			}
			 
			valorTotal = valorTotalVista + valorTotalPrazo;
			System.out.println("O valor total das compras � vista: R$" + valorTotalVista );
			System.out.println("O valor total das compras � prazo: R$" + valorTotalPrazo );
			System.out.println("O valor total das compras efetuadas: R$" + valorTotal );
			
			
		}
	}
