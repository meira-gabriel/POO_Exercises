/*Exercício 19 - Identifique as classes e implemente um programa para a seguinte especificação: "O supermercado vende diferentes 
tipos de produtos. Cada produto tem um preço e uma quantidade em estoque.Um pedido de um cliente é composto de itens, onde cada 
item especifica o produto que o cliente deseja e a respectica quantidade.Esse pedido pode ser pago em dinheiro, cheque ou cartão*/

package Atendimento;

import java.util.ArrayList;
import java.util.Scanner;

import model.Comida;
import model.Doces;
import model.Limpeza;
import model.Pedido;
import model.Produtos;

public class Main {

    static ArrayList<Pedido> pedidos = new ArrayList<>();
    static ArrayList<Produtos> produtos = new ArrayList<>();
    static Scanner leia = new Scanner(System.in);
    
 

    public static void main(String[] args) {
        carregarDados();

        int op = 1;

        while (true) {
            System.out.println("*******Supermercado Elizabeth II********\n");
            System.out.println("1) Relizar pedido\n2) Encerrar atendimento");
            op = leia.nextInt();
            switch (op) {
                case 1:
                    fazerPedido();
                    break;
                case 2:
                	System.out.println("\nO atendimento foi encerrado ");
                	break;
            }
        }
    }

    public static void carregarDados() {
    	System.out.println("\nProdutos por categoria\n");
        Limpeza l1 = new Limpeza("Detergente", 10, 15);
        Limpeza l2 = new Limpeza("Sabão", 30, 20);
        Limpeza l3 = new Limpeza("Vassoura", 15, 7);

        Comida c1 = new Comida("Arroz", 15, 30);
        Comida c2 = new Comida("Feijão", 10, 20);

        Doces d1 = new Doces("Pirulito", 5, 50);
        Doces d2 = new Doces("Bala", 5, 60);

        produtos.add(l1);
        produtos.add(l2);
        produtos.add(l3);

        produtos.add(c1);
        produtos.add(c2);
        
        produtos.add(d1);
        produtos.add(d2);

    }

    public static void fazerPedido() {
    	String nomeCliente;
    	String endereco;
    	String modoDePagamento = "Finalizar";
    	Pedido p = new Pedido(modoDePagamento, produtos);
    	    
        
		
		int u = 0;
		do {
			
			System.out.println("\nNome: ");
		    nomeCliente = leia.nextLine();
			p.setNomeCliente(nomeCliente);
			if(nomeCliente=="") {
				System.out.println("\nCampo obrigatório ");
			}else {
				u++;
			}
		}
			while(u<1);
		
		        System.out.println("Endereço:");
		        endereco = leia.nextLine();
				p.setEndereco(endereco);

				System.out.println("Modo de pagamento?:");
		        modoDePagamento = leia.nextLine();
				p.setNomeCliente(modoDePagamento);
        
        int op;
        while (true) {
            for (int i = 0; i < produtos.size(); i ++){
                System.out.println(i + ")" + produtos.get(i).getNome());
            }
            System.out.println("Digite 0 para encerrar o atendimento");
            op = leia.nextInt();
            if(op != 0 ){
                ArrayList<Produtos> temp = new ArrayList<>();
                
                temp = p.getitensConsumidos();
                System.out.println(temp);
                temp.add(produtos.get(op));
                p.setItensConsumidos(temp);
            }else{
            	p.imprimirNotaFiscal();
                break;
            }
        }
       
        
		
		
    }
    }

