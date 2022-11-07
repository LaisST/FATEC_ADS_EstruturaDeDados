package algoritmoOrdenacao;

//J� insere na posi��o correta

public class InsertSort {
	//M�todo construtor
	public void InsertSort(int []valores) {
		for (int i = 1; i<valores.length;i++) { // Indice come�a com 1, o la�o ir� se repetir enquanto o indice for menor do que a quantidade de itens da lista; a cada final de la�o ir� somar um na variavel i
			int aux=valores[i]; // variavel auxiliar que ir� receber o valor do indice do la�o
			int j=i-1; // a variavel j ir� receber o indice menos um, ou seja, a posi��o anterior
			while((j>=0)&&(aux<valores[j])) { //Enquanto o valor de j for maior ou igual a zero e o valor do auxiliar for menor do que o valor da posi��o j o la�o ir� se repetir
				valores[j+1] = valores[j]; //a posi��o de J +1, ou seja, posi��o atual ir� receber o valor da posi��o anterior
				j--; // diminui 1 na variavel j
			}
			valores [j+1]=aux; // posi��o j+1 (posi��o atual) recebe o valor da variavel auxiliar
		} // continua o la�o for at� a condi��o de parada
	}
	

}
