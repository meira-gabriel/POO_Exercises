package exerciciosLista1;

import java.util.Scanner;

public class Exercicio01 {
  
    public void run(){
        Scanner entrada = new Scanner(System.in);
            System.out.print("Digite um valor para ser impresso ");
            int valor;
            valor = entrada.nextInt();
            System.out.println("o valor digitado foi " + valor);
            entrada.close();
        }
	
        
}
