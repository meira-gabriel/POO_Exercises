/*
EXERCÍCIO 9 - LISTA 1
9. Leia três números reais fornecidos pelo usuário. Descubra qual deles é o menor de todos, imprimindo seu valor.
*/

//biblioteca
import java.util.Scanner;

class Main{
  public static void main(String[] args) {

		//declaracao de variavel
    Scanner valores = new Scanner (System.in);
		int valor[] = new int[3];
		int menor = 999999999; 

    //verificacao de condicao
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = valores.nextInt();
			if(valor[i] < menor){ 
				menor = valor[i];
			}
		}
    //saida
		System.out.println("O Menor valor é " + menor);
  }
}  