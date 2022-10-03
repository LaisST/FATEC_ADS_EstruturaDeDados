package prova;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
System.out.println("Quantos livros favoritos você tem?");
int qtdeLivros = ler.nextInt();
String [] ListaFav = new String[qtdeLivros];
int x = 0;
while(x < qtdeLivros) {
System.out.println("Quantas palavras tem o seu livro?");
int qtdePalavras = ler.nextInt();
ListaLivros livro1 = new ListaLivros(qtdePalavras);
int i = 1;
System.out.println("Digite seu livro favorito: ");
while (i <= qtdePalavras) {
String palavra = ler.next();
livro1.adicionarPalavra(palavra);
i++;
}
String Favorito = livro1.concatenarPalavra();
ListaFav[x] = Favorito;
x++;
}
int c = 0;
int Sim = 0;
while(c<qtdeLivros) {
if(ListaFav[c].equals(" Use a cabeça Java")){
Sim = 1;}
c++;
}
if(Sim == 1) {System.out.println("bom gosto");}
else { System.out.println("não existe o livro pesquisado");}
}
}