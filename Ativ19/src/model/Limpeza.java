package model;

public class Limpeza extends Produtos {
	
	public Limpeza(String nome, double preco, double qest) {
		super(nome, preco, qest);
	}

	@Override
	public String toString() {
		return "Itens de limpeza = " + super.toString() + "\n";
	}
}
