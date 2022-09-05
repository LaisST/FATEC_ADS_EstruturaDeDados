import java.util.Scanner;

public class Quadrado{

	public static void main(String[] args) {
	    int lado;
	    int contador = 0;
	    int contLado = 0;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado: ");
		lado = ler.nextInt();
		
		if (contLado == 0){
            while (contador < lado){  System.out.print("*"); 
            contador ++;}
	    }     
	   contador = 0;
	   contLado =1;
        System.out.println();
	    
	    while (contLado < lado-1){
    	    if (contLado > 0 || contLado < lado -1){
        	    while (contador < lado){
        	        if (contador == 0 || contador == lado-1 ) { System.out.print("*");
        	            contador ++;
        	            
        	        }
        	        else{ System.out.print(" ");
        	            contador ++;}
        	    }  
        	    System.out.println();
    	    }  
    	    
    	   contLado ++;
    	   contador = 0;

    	   }
    	       	   
    	   if (contLado == lado-1 ){
        	    while (contador < lado){  System.out.print("*"); 
        	    contador ++;}
	    } //Fim While
	} // Fim main
} // Fim Classe

