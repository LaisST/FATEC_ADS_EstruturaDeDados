package algoritmoOrdenacao;

//Já insere na posição correta

public class InsertSort {
	//Método construtor
	public void InsertSort(int []valores) {
		for (int i = 1; i<valores.length;i++) { // Indice começa com 1, o laço irá se repetir enquanto o indice for menor do que a quantidade de itens da lista; a cada final de laço irá somar um na variavel i
			int aux=valores[i]; // variavel auxiliar que irá receber o valor do indice do laço
			int j=i-1; // a variavel j irá receber o indice menos um, ou seja, a posição anterior
			while((j>=0)&&(aux<valores[j])) { //Enquanto o valor de j for maior ou igual a zero e o valor do auxiliar for menor do que o valor da posição j o laço irá se repetir
				valores[j+1] = valores[j]; //a posição de J +1, ou seja, posição atual irá receber o valor da posição anterior
				j--; // diminui 1 na variavel j
			}
			valores [j+1]=aux; // posição j+1 (posição atual) recebe o valor da variavel auxiliar
		} // continua o laço for até a condição de parada
	}
	

}

/* Teste de Mesa
 * 
 * InserSort(int [5,2,6,7] valores){
 *  for (i = 1; 1 < 4; 1++){
 *  	aux = 2;
 *  	j = 0;
 *  	while((0>=0)&&(2<5)){
 *  		valores[1] = 5;
 *  		-1;
 *  	}
 *  	valores[0] = 2;
 *  }
 *  } 

 * 
 * */
