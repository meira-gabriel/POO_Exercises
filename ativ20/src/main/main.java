package main;

import java.util.Scanner;

public class main {
    public static int menu(){
        try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("1 - Encontrar um contato");
			System.out.println("2 - Incluir um contato");
			System.out.println("3 - Remover um contato");
			System.out.println("4 - Ver todos os contatos");
			System.out.println("5 - Remover todos os contatos");
			System.out.println("0 - Sair");
			System.out.print("-> ");
			int n = teclado.nextInt();
			System.out.println("");
			return n;
		}
    }
    public main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
			Contatos contatos = new Contatos();
			contatos.criaListaContatos();
			System.out.println("Agenda Telefônica\n");
			int n = menu();
			while (n != 0){
			    switch (n){
			        case 1:         
			            if (!contatos.contatosVazio()){
			                System.out.print("Pesquisar contato: ");
			                contatos.buscaContato(teclado.next());
			            }else
			                System.out.println("Agenda vazia!");    
			        case 2:
			            
			            System.out.print("Nome: ");
			            contatos.insereContato(teclado.next());     
			        case 3:
			            if (!contatos.contatosVazio()){
			                System.out.print("Nome: ");
			                contatos.removeContato(teclado.next());
			                System.out.println("Contato removido!");
			            }else
			                System.out.println("Agenda vazia!");
			        case 4: 
			            if (!contatos.contatosVazio()){
			                contatos.exibeAgenda();
			            }else
			                System.out.println("Agenda vazia!"); 
			        case 5:
			            contatos.apagaContatos();
			            System.out.println("Agenda apagada!");
			        
			        default:
			        	System.out.println("Digite uma opção válida!");
			    }
			    System.out.println("");
			    n = menu();
			}
		}
    }
}