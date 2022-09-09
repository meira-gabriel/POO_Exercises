package Exercicio3;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		/**
		import java.util.Scanner;
		
		public class Distancia {
 		public static void main(String[] args) {
 				
 			Scanner teclado = new Scanner(System.in);
 			double x1, y1, x2, y2, distancia;
			 System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
			 x1 = teclado.nextFloat();
			 y1 = teclado.nextFloat();
			 x2 = teclado.nextFloat();
			 y2 = teclado.nextFloat();
			
			 distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 1/2);
			 System.out.println("A distância é: " + distancia);
 			}
		}
		*/
		
/*
 * Defeito do código: 
 * O problema está na potência "1/2". O cálculo é feito com dois números inteiros, uma operação 
 * com dois inteiros retornará um valor inteiro, portanto esse cálculo não dará "0,5" e sim "0", 
 * logo todo resultado será elevado a 0 e retornará 1.0, e o tipo será real como a variável 
 * "distancia" é do tipo double. 
 */
		
	    /* CÓDIGO MODIFICADO: */
		
		
		Scanner teclado = new Scanner(System.in);
		double x1, y1, x2, y2, distancia;

		 System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
		 x1 = teclado.nextFloat();
		 y1 = teclado.nextFloat();
		 x2 = teclado.nextFloat();
		 y2 = teclado.nextFloat();
		 
		 distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
		 System.out.println("A distância é: " + distancia);
		
	}

}