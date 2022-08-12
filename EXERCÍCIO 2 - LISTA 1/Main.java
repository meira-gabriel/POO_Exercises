/*
EXERCÍCIO 2 - LISTA 1
2. Escreva um programa que leia um número real fornecido pelo usuário, armazenando-o numa variável apropriada. Imprima o valor lido. 
*/

//biblioteca
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //informação a ser apresentada na tela
    System.out.println("Leitor de Números Real");
    System.out.println ("--------------------------------");
	  
    //tipo de "variavél", ou neste caso objeto
    float numero;

    //classe reaproveita objeto, dando novo valor para o objeto
		Scanner scan = new Scanner (System.in);

    //entrada de dados      
    System.out.print("Digite um número real: ");
		//"nextLine" é para captura de texto
		numero = scan.nextFloat();
		
    //saída, println é para demonstrar em linha diferente
    System.out.println ("--------------------------------");
		System.out.print ("O número real digitado é: " + numero);
		
	}
		
}