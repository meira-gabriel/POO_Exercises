package exercicio04;

import java.util.Scanner;
import java.util.InputMismatchException;

public class main {

	public static void main(String[] args) {

	String nome = null;
	Float preco = null;
	Long quantidade = null;
	Float desconto = null;
	Float valorTotal = null;
				
	do {
		Scanner sc = new Scanner(System.in);	
		
	try {
		System.out.println("\nInsira o nome do produto: ");
		nome = sc.next();
					
		System.out.println("\nInsira o preço do " + nome + ":");
		preco = sc.nextFloat();
					
		System.out.println("\nInsira a quantidade de " + nome + " comprados(as): ");
		quantidade = sc.nextLong();
							
		if(quantidade > 50) {
		desconto = 0.25f;
		
		}else if( quantidade > 20 && quantidade <= 50) {
		desconto = 0.20f;
		
		}else if(quantidade > 10 && quantidade <= 20) {
		desconto = 0.10f;
		
		}else {
		desconto = 0f;
		}	
		
		if(desconto == 0f) {
		valorTotal = quantidade * preco;
		
		}else {
		valorTotal = preco * quantidade;
		}
					System.out.println(quantidade + "x " + nome + "\nValor Total = " + valorTotal);
					System.out.println("\nCadastre um novo produto");
						
				}catch(Exception e){
					System.out.println("Erro interno");
					System.exit(0);
				}
				
			} while (true);
			
			
			
		}

	}
