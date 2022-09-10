package exerciciosLista1;

//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio22 {

	public void run() {
		/*Considerando um objeto m�vel em movimento uniformemente variado, escreva um programa que receba as seguintes
			informa��es: um valor real indicando posi��o inicial do m�vel P0, um valor real que corresponde a velocidade do m�vel
			V, um outro valor real A correspondente a acelera��o do m�vel e um n�mero inteiro correspondente ao tempo decorrido
			T. O programa deve calcular a posi��o final PF do m�vel, dado pela rela��o abaixo:
			PF = P0 + V * T + (A * T2) / 2 */
		Scanner input = new Scanner(System.in);
		
		float pf;
		
		System.out.println("Digite o valor P0 (Posi��o Inicial): ");
		float po = input.nextInt();
		System.out.println("Digite o valor V (Velocidade): ");
		float v = input.nextInt();
		System.out.println("Digite o valor A (Acelera��o): ");
		float a = input.nextInt();
		System.out.println("Digite o valor T (Tempo): ");
		double t = input.nextInt();
		
		double potT = Math.pow(t, 2);
		
		pf = (float) ((po + (v*t) + (a*potT))/2);
						
		System.out.println("A posi��o final do m�vel � " + pf);
		
	
	}
}