package exerciciosLista1;

import java.util.Scanner;

public class Exercicio19 {
		/*Escreva um programa que leia um número real entre 0.00 e 100.00 e o exiba por extenso como se fosse uma quantia em
			dinheiro, por exemplo: 1.00 -> "um real", .12.73 -> "doze reais e setenta e três centavos". */
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		double n = input.nextDouble();
		System.out.println( extensoMoney(n) );
	}
	
	private String extensoMoney(double n) {  // 15892.54
		String nExtenso = "";
		int   inteiro   = (int) n ;   // (int)15892.54 = // 15892
		float pog = (float) 0.000002; // correÃ§Ã£o de subtrair um int de um float
		
		int   decimal   = (int)(((n - inteiro)+pog) * 100) ; // 15892.54 - 15892 = 0.54 * 100 = 54 
		
		Exercicio18 exercicio18 = new Exercicio18();
		
		nExtenso += exercicio18.extenso(inteiro);
		nExtenso += ((inteiro==1)?" real ":((inteiro>1)?" reais ":""));
		
		nExtenso += ((inteiro!=0)&&(decimal!=0))?" e ": "";
		
		nExtenso += exercicio18.extenso(decimal);
		nExtenso += ((decimal==1)?" centavo ":((inteiro>1)?" centavos ":""));
		
		return(nExtenso);
	}
	
}
