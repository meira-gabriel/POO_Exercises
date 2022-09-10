package exerciciosLista1;

import java.security.AlgorithmConstraints;
//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio27 {

	public void run() {
		/*Calcule a média de Notas de alunos. O programa deve parar de ler valores quando for fornecido um valor negativo como
			nota. */
		Scanner input = new Scanner(System.in);
		
		int cont = 0;
		float soma = 0,nota, media = 0;
		
		do {
			System.out.println("Insira a nota: ");
			nota = input.nextFloat();
			
			if(nota>=0){
				soma = soma+nota;
				cont++;
			}else {
				media = soma/cont;
			}
			
		}while(nota >= 0);
		
		
		
		System.out.println("A média é: " + media);	
	
	}
}