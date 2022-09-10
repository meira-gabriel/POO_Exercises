package exerciciosLista1;

//import java.lang.FdLibm.Pow;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio24 {

	public void run() {
		/*Implementar três programas para exibir a tabuada de um número inteiro entre 1 e 20 dado pelo usuário.
			a) Usando enquanto (while)
			b) Usando faça-enquanto (do-while)
			c) Usando para (for)
			Obs. Caso o valor dado seja inválido o programa deve apenas exibir uma mensagem de aviso. */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual tabuada voce deseja conferir 1..20): ");
		int num = input.nextInt();

		int x=0, y, tab;
		
		System.out.println("Escolha o modelo que deseja utilizar:");
		System.out.println("Modelo WHILE = 1");
		System.out.println("Modelo DO WHILE = 2");
		System.out.println("Modelo FOR = 3");
		int opcao = input.nextInt();
		
		switch (opcao){
		
			case 1:{
				System.out.println("Modelo WHILE");
				while(x<11){
					tab = num*x;
					System.out.println("" + num + " x" + " " + x + " = " + tab);
					x = x+1;	
				}
			}break;
			case 2:{
				System.out.println("Modelo DO WHILE");
				do{
					tab = num*x;
					System.out.println("" + num + " x" + " " + x + " = " + tab);
					x = x+1;
				}while(x<11);
			}break;
			case 3:{
				System.out.println("Modelo FOR");
				for(x=0; x<=10; x++){
					tab = num*x;
					System.out.println("" + num + " x" + " " + x + " = " + tab);
				}return;
			}default:{
				System.out.println("OPÇÃO INVÁLIDA!");
			}
			
		}
		
	}
}