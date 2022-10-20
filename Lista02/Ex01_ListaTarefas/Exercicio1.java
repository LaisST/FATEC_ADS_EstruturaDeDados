import java.util.Arrays;

public class Exercicio1 {
  String[] lista;
  int nrItens;
  int tamanho;

  
  Exercicio1(int nrItens){
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
    

 public int pesquisar(String t) {
      int i;
	 for(i = 0; i < getTamanho() && !(lista[i].equals(t)); i++) {}
	 
		if (t.equals(lista[i])) {  return 1; } 
	    else{ return 2; }
		

  }

  
  //Getters
  public int getTamanho() { return this.tamanho; }
  public int getNrItens() { return this.nrItens; }
  
}
