package model;

public abstract class Produtos {
	
	protected String nome;
	protected double preco;
	protected double qest;
	
	public Produtos(String nome, double preco, double qest) {
		this.nome = nome;
		this.preco = preco;
		this.qest = qest;
	}
	
	
    @Override
    public String toString() {
        return nome + ", preco = " + preco + ", quantidade em estoque = " + qest;
    }
    
    public double getPreco() {
    	return this.preco;
    }
	
    public String getNome() {
    	return this.nome;
    }
}
