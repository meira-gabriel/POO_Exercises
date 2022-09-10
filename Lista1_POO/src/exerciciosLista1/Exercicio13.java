package exerciciosLista1;

import java.util.Scanner;

public class Exercicio13 {

	public void run() {
		/*Dados 3 valores reais representando os lados de um possível triângulo, verifique se os mesmos formam um triângulo (a
			medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
			triângulo, descubra também se este triângulo é escaleno (três lados diferentes), isósceles (dois lados iguais) ou eqüilátero
			(três lados iguais). */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para o lado A: ");
		int a = input.nextInt();
		System.out.print("Digite um valor para o lado B: ");
		int b = input.nextInt();
		System.out.print("Digite um valor para o lado C: ");
		int c = input.nextInt();
		
		if ( (a<b+c) && (b<a+c) && (c<a+b) ){
			
			if( (a != b) && (b != c) && (a != c) ){
				System.out.print("Valores formam um triângulo escaleno.");
			}else{
				if( (a == b) && (b == c) && (a == c ) ){
					System.out.print("Valores formam um triângulo equilátero.");
				}else{
					System.out.print("Valores formam um triângulo isósceles.");
				}
			}
			
		}else{
			System.out.print("Valores inconsistentes para a formação de um triângulo!");
			return;
			}
	
	
	}
}