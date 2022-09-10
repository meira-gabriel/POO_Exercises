package exerciciosLista1;

//import java.awt.event.InputEvent;
import java.security.AlgorithmConstraints;
//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class Exercicio30 {

	public void run() {
		/*Escreva um programa que calcule o valor de y = f(x) = a*x + b num intervalo de valores de x, sendo dados pelo usuário
			os coeficientes a e b, bem como os valores do limite inferior e superior do intervalo de x bem como o valor do incremento
			de x. O programa deve exibir resultados como um tabela onde constam os valores de x e y=f(x) lado a lado. */
Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		int a = input.nextInt();
		System.out.println("Digite um valor para B: ");
		int b = input.nextInt();
		System.out.println("Digite um valor minimo para X: ");
		int minX = input.nextInt();
		System.out.println("Digite um valor maximo para X: ");
		int maxX = input.nextInt();
		System.out.println("Digite um valor para o incremento de X: ");
		int incX = input.nextInt();
		
		for(int x = minX; x<= maxX; x += incX) {
			System.out.println(" Y = f(x) = a*x + b = "+ a + "*" + x + " + " + b + " = " + ((a*x)+b));
		}
		
	}
}