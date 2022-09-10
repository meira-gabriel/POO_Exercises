package model;

import java.util.ArrayList;

public class Pedido {
	
    private String nomeCliente;
    private ArrayList<Produtos> itensConsumidos;
    private double preco;

    public Pedido(String nomeCliente, ArrayList<Produtos> itensConsumidos) {
        this.nomeCliente = nomeCliente;
        this.itensConsumidos = itensConsumidos;
    }
    
    @Override
    public String toString() {
    	return "Nome do cliente: " + nomeCliente + " Itens pedidos: " + itensConsumidos.toString();
     }
    
    public double getPreco() {
    	return this.preco;
    }
    
    public double calcularPrecoPedido() {
    	for(Produtos produtos : itensConsumidos) {
    		preco = preco + produtos.getPreco();
    	}
    	
    	return preco;
    }
    
    public double calcularTotal() {
    	return preco;
    }
    
    public double calcularTroco(double recebido) {
        double troco = recebido - calcularTotal();
        
        if (troco > 0) {
        	return troco;
        } else {
        	return -1;
        }
    }

	public void setNomeCliente(String nomeCliente2) {
		// TODO Auto-generated method stub
		
	}

	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		
	}

	public void imprimirNotaFiscal() {
		// TODO Auto-generated method stub
		
	}

	public void setItensConsumidos(ArrayList<Produtos> temp) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Produtos> getitensConsumidos() {
		return itensConsumidos;
		// TODO Auto-generated method stub
	}

}
