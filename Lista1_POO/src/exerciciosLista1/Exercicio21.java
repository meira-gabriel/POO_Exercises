package exerciciosLista1;

//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio21 {

	public void run() {
		/*Fa�a um algoritmo que, lendo 3 n�meros correspondentes aos coeficientes a, b, e c de uma equa��o do 2� grau, calcule
			seu DELTA e tamb�m as ra�zes desta equa��o, imprimindo seus valores. */
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
		
		System.out.println("O delta da fun��o �: " + delta);
		
		int deltaQuad = (int) Math.sqrt(delta);
		
		float raizA = ((-b) + deltaQuad)/(2*a);
		float raizB = ((-b) - deltaQuad)/(2*a);
		
		System.out.println("A raiz A da fun��o �: " + raizA);
		System.out.println("A raiz B da fun��o �: " + raizB);
	
	}
}