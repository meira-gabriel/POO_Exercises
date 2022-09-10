package exerciciosLista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
		/*Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em pés
			(1 metro = 3.315 pés), exibindo os valores dado e convertido. Caso o usuário forneça um valor negativo, deve ser exibida
			uma mensagem e a operação de conversão não deve ser efetuada. */
	public void run() {

		Scanner input = new Scanner(System.in);
		
		float pes = 0;
		
		System.out.println("Digite a quantidade de metros: ");
		float metro = input.nextInt();
		
			if( metro < 0 ){ 
				System.out.println("Valor negativo. Conversão não realizada!");
				return;
			}else{
				pes = metro*3315;
		}
		System.out.println("" + metro + " metro(s) equivale à " + pes + " pes.");
	
	
	}
}