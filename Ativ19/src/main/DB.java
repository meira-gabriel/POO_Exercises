package main;

import java.util.ArrayList;

import model.Limpeza;
import model.Comida;
import model.Produtos;
import model.Doces;

public class DB {
	public ArrayList<Produtos> produtos;
	
	public ArrayList<Produtos> populate() {
		
		produtos = new ArrayList<Produtos>();
		
		Limpeza limpeza1 = new Limpeza("Detergente", 10, 15);
		Limpeza limpeza2 = new Limpeza("Sabao", 30, 20);
		Limpeza limpeza3 = new Limpeza("Vassoura", 15, 7);
		
		Comida comida1 = new Comida("Arroz", 15, 30);
		Comida comida2 = new Comida("Feijão", 10, 20);
		
		Doces doce1 = new Doces("Pirulito", 5, 50);
		Doces doce2 = new Doces("Bala", 5, 60);
		
		produtos.add(limpeza1);
		produtos.add(limpeza2);
		produtos.add(limpeza3);
		
		produtos.add(comida1);
		produtos.add(comida2);
		
		produtos.add(doce1);
		produtos.add(doce2);
				
		return produtos;
	}

}
