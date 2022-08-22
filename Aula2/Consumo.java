import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {

		double km;
		double gasolina;
		double consumo;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite a distancia em Km: ");
		km= ler.nextDouble();
		System.out.println("Digite a quantidade de litros de gasolina: ");
		gasolina=ler.nextDouble();
		consumo = km/gasolina;
		
		System.out.println("Seu carro consume " + consumo + " L/Km");
		if (consumo < 8) { System.out.println("Venda o carro!");}
		else if (consumo >8 && consumo < 14 ){ System.out.println("Econômico");}
		else if (consumo > 14 ) {System.out.println("Super Econômico");}
	

}}
