/*
EXERCÍCIO 3 - LISTA 1
3. Leia um número qualquer fornecido pelo usuário. Determine se o número é maior do que 50, imprimindo uma mensagem indicando tal fato. 
*/

//biblioteca
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // informação a ser apresentada na tela
    System.out.println("Determinador de Número Maior ou Menor que 50");
    System.out.println("--------------------------------");

    // tipo de "variavél", ou neste caso objeto
    int numero;

    // classe reaproveita objeto, dando novo valor para o objeto
    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < 1; i++) {
      // entrada de dados
      System.out.print("Digite um número inteiro: ");
      numero = scan.nextInt();

      // verifica a condição
      if (numero == 50) {
        // saída, println é para demonstrar em linha diferente
        System.out.println("--------------------------------");
        System.out.print("O número " + numero);
        System.out.print(" é igual a 50.");
      }
      if (numero > 50) {
        // saída, println é para demonstrar em linha diferente
        System.out.println("--------------------------------");
        System.out.print("O número " + numero);
        System.out.print(" é maior que 50.");
      }
      if (numero < 50) {
        // saída, println é para demonstrar em linha diferente
        System.out.println("--------------------------------");
        System.out.print("O número " + numero);
        System.out.print(" é menor que 50.");
      }
    }

  }
}