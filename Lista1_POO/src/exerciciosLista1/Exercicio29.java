package exerciciosLista1;

import java.security.AlgorithmConstraints;
//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio29 {

	public void run() {
		/*Faça um programa que exiba a tabela verdade da operação OU-Lógico para todas as combinações de três variáveis
			lógicas A, B e C. Os resultados da tabela devem ser exibidos como F ou V. */
		for(int a = 0; a<=1; a++)
			for(int b = 0; b<=1; b++)
				for(int c = 0; c<=1; c++)
					if((a==b) && (a==c) && (b==c)) {
					System.out.println( (a==1) +" OU " + (b==1) +" OU " + (c==1) +" = "+ (a==1 && b==1 && c==1) );
					}else {
						System.out.println( (a!=0) +" OU " + (b!=0) +" OU " + (c!=0) +" = "+ (a==1 && b==1 && c==1) );
					}
	}
}