package exerciciosLista1;

//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio22 {

	public void run() {
		/*Considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba as seguintes
			informações: um valor real indicando posição inicial do móvel P0, um valor real que corresponde a velocidade do móvel
			V, um outro valor real A correspondente a aceleração do móvel e um número inteiro correspondente ao tempo decorrido
			T. O programa deve calcular a posição final PF do móvel, dado pela relação abaixo:
			PF = P0 + V * T + (A * T2) / 2 */
		Scanner input = new Scanner(System.in);
		
		float pf;
		
		System.out.println("Digite o valor P0 (Posição Inicial): ");
		float po = input.nextInt();
		System.out.println("Digite o valor V (Velocidade): ");
		float v = input.nextInt();
		System.out.println("Digite o valor A (Aceleração): ");
		float a = input.nextInt();
		System.out.println("Digite o valor T (Tempo): ");
		double t = input.nextInt();
		
		double potT = Math.pow(t, 2);
		
		pf = (float) ((po + (v*t) + (a*potT))/2);
						
		System.out.println("A posição final do móvel é " + pf);
		
	
	}
}