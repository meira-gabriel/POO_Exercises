package exerciciosLista1;

//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio25 {

	public void run() {
		/*Faça um programa que calcule a soma de N números quaisquer fornecidos pelo usuário. */
		Scanner input = new Scanner(System.in);
		
		int soma=0;
		
		System.out.println("Insira a quantidade de digitos à serem somados: ");
		int  n = input.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Insira um número: ");
			int  alg = input.nextInt();
			soma = soma+alg;
		}
		
		System.out.println("O resultado é: " + soma);	
	
	}
}