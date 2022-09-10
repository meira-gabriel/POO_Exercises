package exerciciosLista1;

import java.util.Scanner;

public class Exercicio13 {

	public void run() {
		/*Dados 3 valores reais representando os lados de um poss�vel tri�ngulo, verifique se os mesmos formam um tri�ngulo (a
			medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
			tri�ngulo, descubra tamb�m se este tri�ngulo � escaleno (tr�s lados diferentes), is�sceles (dois lados iguais) ou eq�il�tero
			(tr�s lados iguais). */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para o lado A: ");
		int a = input.nextInt();
		System.out.print("Digite um valor para o lado B: ");
		int b = input.nextInt();
		System.out.print("Digite um valor para o lado C: ");
		int c = input.nextInt();
		
		if ( (a<b+c) && (b<a+c) && (c<a+b) ){
			
			if( (a != b) && (b != c) && (a != c) ){
				System.out.print("Valores formam um tri�ngulo escaleno.");
			}else{
				if( (a == b) && (b == c) && (a == c ) ){
					System.out.print("Valores formam um tri�ngulo equil�tero.");
				}else{
					System.out.print("Valores formam um tri�ngulo is�sceles.");
				}
			}
			
		}else{
			System.out.print("Valores inconsistentes para a forma��o de um tri�ngulo!");
			return;
			}
	
	
	}
}