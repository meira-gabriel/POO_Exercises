package exerciciosLista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

	public void run() {
		/* 12. Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos. O usuário deve
			fornecer o número de copos a serem comprados e o programa deve calcular o preço total a ser cobrado, exibindo-o.
			Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05; se o número de copos está entre
			101 e 500, o preço por copo é R$0.04; finalmente se o número de copos é superior a 500 o preço por copo é R$0.035. */
		Scanner input = new Scanner(System.in);
		
		float total;
		
		System.out.println("Digite a quantidade de copos a serem comprados: ");
		int a = input.nextInt();
		
		if ( a<=100 ){ 
			total = a*0.05f; 
		}else{
			if( (a>=101) && (a<=500) ){ 
				total = a*0.04f;
			}else{
				total = a*0.035f;
			}
		}
		System.out.println("O valor a ser pago é: R$" + total);
	
	
	}
}