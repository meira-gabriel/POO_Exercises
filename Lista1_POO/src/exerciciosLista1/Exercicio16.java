package exerciciosLista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16 {

	public void run() {
		/*Preparar um programa para ler as medidas da base e da altura de um tri�ngulo, calculando e imprimindo sua �rea,
			sabendo que o c�lculo da �rea � dado por:
			area = (base*altura)/2. */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a medida da altura do tri�ngulo: ");
		float altura1 = input.nextInt();
		System.out.println("Digite a medida da base do tri�ngulo: ");
		float base1 = input.nextInt();
		
		float area1 = (base1 * altura1)/2;
		
		System.out.println("A area do tri�ngulo �: "+ area1);
			
	}
}