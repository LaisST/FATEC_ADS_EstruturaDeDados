import java.util.Arrays;

public class Selecao {
  String[] lista;
  int nrItens;
  int tamanho;

  
  Selecao(int nrItens){
	  this.tamanho = 0;
	  this.nrItens = nrItens;
	  lista = new String[nrItens];
  }
    
  public void adicionar(String n) {
	  nrItens = nrItens * 2;
	  String [] auxiliar = lista;
	  this.lista = new String [nrItens];
	  this.lista = Arrays.copyOf(auxiliar,nrItens);
	  lista[tamanho] = n;
	  tamanho ++;
  }
  
  public String concatenar() {
	  String s="";
	  for(int i=0; i< tamanho; i++) {
		   s = s +"\n* "+lista[i]; }
	  return s;
  }
    

  public String pesquisar(String j) {
      int i;
      String resultado = " ";
	 for(i = 0; i < getTamanho() && !(lista[i].equals(j)); i++) {}
	 
		if (j.equals(lista[i])) {  
		    resultado = "Esse jogador está na lista"; 
		} else {
		    resultado = "Esse jogador Não está na lista"; 
		}
        return resultado;
  }

  //Getters
  public int getTamanho() { return this.tamanho; }
  public int getNrItens() { return this.nrItens; }
  
}
