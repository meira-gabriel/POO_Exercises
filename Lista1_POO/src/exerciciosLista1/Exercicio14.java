package exerciciosLista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio14 {

	public void run() {
		/*Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética. Imprima também
			"Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame" se estiver entre 3 e 7. */
		Scanner input = new Scanner(System.in);
		
		float media;
		
		System.out.println("Digite as três notas: ");
		float n1 = input.nextInt();
		float n2 = input.nextInt();
		float n3 = input.nextInt();
		
		media = (n1 + n2 + n3)/3;
		
		if ( media<3 ){ 
			System.out.println("A média é: " + media);
			System.out.println("Reprovado!");
		}else{
			if( (media>=3) && (media<=7) ){ 
				System.out.println("A média é: " + media);
				System.out.println("Exame!");
			}else{
				System.out.println("A média é: " + media);
				System.out.println("Aprovado!");
			}
		}	
	
	}
}