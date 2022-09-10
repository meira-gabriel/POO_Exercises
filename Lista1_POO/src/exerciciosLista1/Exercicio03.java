package exerciciosLista1;

import java.util.Scanner;

public class Exercicio03 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		if ( valor > 50){
			System.out.println("O valor lido " + valor + " eh maior que 50!");
		}
	}
}
