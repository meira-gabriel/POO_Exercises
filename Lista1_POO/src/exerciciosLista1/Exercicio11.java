package exerciciosLista1;

import java.util.Scanner;

public class Exercicio11 {

	public void run() {
		/* 11. Escreva um programa que leia dois n�meros inteiros A e B quaisquer indicando se A � m�ltiplo de B ou se B � m�ltiplo de A. */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		int a = input.nextInt();
		System.out.print("Digite um valor para B: ");
		int b = input.nextInt();
		
		if ( a%b == 0 ) { 
			System.out.print("O n�mero "+ a + " eh mmultiplo de " + b  );
		} else {
			if ( b%a == 0 ) { 
			System.out.print("O n�mero "+ b + " eh multiplo de " + a  );
			} else {
				if ( a%b != 0 && b%a != 0 ) { 
				System.out.print("Os n�mero "+ a + " e " + b + " n�o s�o multiplos" );
				}
			}
		}
	
	
	}
}