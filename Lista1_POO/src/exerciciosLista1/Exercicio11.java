package exerciciosLista1;

import java.util.Scanner;

public class Exercicio11 {

	public void run() {
		/* 11. Escreva um programa que leia dois números inteiros A e B quaisquer indicando se A é múltiplo de B ou se B é múltiplo de A. */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		int a = input.nextInt();
		System.out.print("Digite um valor para B: ");
		int b = input.nextInt();
		
		if ( a%b == 0 ) { 
			System.out.print("O número "+ a + " eh mmultiplo de " + b  );
		} else {
			if ( b%a == 0 ) { 
			System.out.print("O número "+ b + " eh multiplo de " + a  );
			} else {
				if ( a%b != 0 && b%a != 0 ) { 
				System.out.print("Os número "+ a + " e " + b + " não são multiplos" );
				}
			}
		}
	
	
	}
}