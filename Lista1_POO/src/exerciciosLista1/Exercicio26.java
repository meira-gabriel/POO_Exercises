package exerciciosLista1;

import java.security.AlgorithmConstraints;
//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio26 {

	public void run() {
		/*Escreva um programa que calcule a soma de N n�meros quaisquer fornecidos pelo usu�rio. O programa deve parar de ler
			e, portanto somar os valores quando for introduzido o n�mero 0 (zero). */
		Scanner input = new Scanner(System.in);
		
		int alg, soma=0;
		
		do {
			System.out.println("Insira um n�mero: ");
			alg = input.nextInt();
			soma = soma+alg;
		} while(alg!=0);
		
		System.out.println("O resultado �: " + soma);	
	
	}
}