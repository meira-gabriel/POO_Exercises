package model;

public class Comida extends Produtos {
	
	public Comida(String nome, double preco, double qest) {
		super(nome, preco, qest);
	}
	
	@Override
	public String toString() {
		return "Itens de comida = " + super.toString() + "\n";
	}
}
