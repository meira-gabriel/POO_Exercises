package exerciciosLista1;

//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio23 {

	public void run() {
		/*Escreva um programa que receba as seguintes informa��es: um valor real indicando capital inicial PV, um valor real que
			corresponde a taxa de juros da aplica��o J e um n�mero inteiro de per�odos da aplica��o N. O programa deve retornar o
			capital futuro FV dado pela rela��o abaixo:
			FV = PV * ( 1 + J )^n */
		Scanner input = new Scanner(System.in);
		
		float fv;
		
		System.out.println("Digite o valor PV (Capital inicial): ");
		float pv = input.nextInt();
		System.out.println("Digite o valor J (Taxa de juros): ");
		float j = input.nextInt();
		System.out.println("Digite o valor N (periodo da aplica��o): ");
		int n = input.nextInt();
		
		double jTotal = Math.pow(1+(j/100), n);
		
		fv = (float) (pv * jTotal);
		
		System.out.println("O capital futuro �: R$ " + fv);	
	
	}
}