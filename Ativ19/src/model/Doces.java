package model;

public class Doces extends Produtos {

	public Doces(String nome, double preco, double qest) {
		super(nome, preco, qest);
	}
		
	@Override
	public String toString() {
		return "Itens de doces = " + super.toString() + "\n";
	}
}
