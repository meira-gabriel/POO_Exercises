/*
GABRIEL MEIRA LIMA - GU3020428

EXERCÍCIO 8 - LISTA 1
8. Leia três números inteiros fornecidos pelo usuário. Descubra qual deles é o maior de todos, imprimindo seu valor.
*/

//biblioteca
import java.util.Scanner;

class Main{
  public static void main(String[] args) {

		//declaracao de variavel
    Scanner valores = new Scanner (System.in);
		int valor[] = new int[3];
		int maior = 0; 

    //verificacao de condicao
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = valores.nextInt();
			if(valor[i] > maior){ 
				maior = valor[i];
			}
		}
    //saida
		System.out.println("O Maior valor é " + maior);
  }
}
