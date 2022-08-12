/*
GABRIEL MEIRA LIMA - GU3020428

EXERCÍCIO 1- LISTA 1
1. Escreva um programa que leia um número inteiro fornecido pelo usuário, armazenando-o numa variável apropriada. Imprima o valor lido.
*/

//biblioteca
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //informação a ser apresentada na tela
    System.out.println("Leitor de Números Inteiros");
    System.out.println ("--------------------------------");
	  
    //tipo de "variavél", ou neste caso objeto
    int numero;

    //classe reaproveita objeto, dando novo valor para o objeto
		Scanner scan = new Scanner (System.in);

    //entrada de dados      
    System.out.print("Digite um número inteiro: ");
		//"nextLine" é para captura de texto
		numero = scan.nextInt();
		
    //saída, println é para demonstrar em linha diferente
    System.out.println ("--------------------------------");
		System.out.print ("O número inteiro digitado é: " + numero);
		
	}
		
}