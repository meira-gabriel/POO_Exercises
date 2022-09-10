package exerciciosLista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {

	public void run() {
		/*Escreva um programa que realize as seguintes tarefas:
			a) Efetue a leitura de dois valores inteiros, os quais serão denominados x e y;
			b) Realize a soma dos valores x e y, exibindo seu resultado;
			c) Realize o produto dos valores x e y exibindo seu resultado;
			d) Compare os valores x e y, indicando se "X > Y", "X = Y" e "X < Y" para os casos correspondentes. */
		Scanner input = new Scanner(System.in);
		
		int soma, prod;
		
		System.out.println("Digite o valor x: ");
		int x = input.nextInt();
		System.out.println("Digite o valor y: ");
		int y = input.nextInt();
		
		soma = x + y;
		prod = x * y;
		
		System.out.println("Soma entre valores x:"+ x + " e y:" + y + " = " + soma);
		System.out.println("Produto entre valores x:"+ x + " e y:" + y + " = " + prod);
		
		if ( x>y ){ 
			System.out.println(""+ x + ">" + y);
		}else{
			if( x<y ){ 
				System.out.println(""+ x + "<" + y);
			}else{
				System.out.println(""+ x + "=" + y);
			}
		}	
	
	}
}