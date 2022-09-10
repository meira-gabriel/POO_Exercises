package exerciciosLista1;

//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio21 {

	public void run() {
		/*Faça um algoritmo que, lendo 3 números correspondentes aos coeficientes a, b, e c de uma equação do 2º grau, calcule
			seu DELTA e também as raízes desta equação, imprimindo seus valores. */
		Scanner input = new Scanner(System.in);
		
		double delta;
		
		System.out.println("Digite o valor para A: ");
		float a = input.nextFloat();
		System.out.println("Digite o valor para B: ");
		float b = input.nextFloat();
		System.out.println("Digite o valor para C: ");
		float c = input.nextFloat();
		
		float bQuad = (float) Math.pow(b,2);
		delta =  bQuad - ((4*a)*c);
		
		System.out.println("O delta da função é: " + delta);
		
		int deltaQuad = (int) Math.sqrt(delta);
		
		float raizA = ((-b) + deltaQuad)/(2*a);
		float raizB = ((-b) - deltaQuad)/(2*a);
		
		System.out.println("A raiz A da função é: " + raizA);
		System.out.println("A raiz B da função é: " + raizB);
	
	}
}