package exerciciosLista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio17 {

	public void run() {
		/*Escreva um programa que leia um valor inteiro correspondente a uma quantidade de segundos, convertendo o valor dado
			em horas corridas sabendo que 3600 segundos equivalem a 1 hora, exibindo os valores dado e convertido. Caso o
			usuário forneça um valor negativo, deve ser exibida uma mensagem e a operação de conversão não deve ser efetuada. */
		Scanner input = new Scanner(System.in);
		
		float horas = 0;
		
		System.out.println("Digite a quantidade de segundos: ");
		int seg1 = input.nextInt();
		
			if( seg1 < 0 ){ 
				System.out.println("Valor negativo. Conversão não realizada!");
				return;
			}else{
				horas = seg1/3600;
		}
		System.out.println("" + seg1 + " segundo(s) equivale à " + horas + " horas.");
	
	
	}
}