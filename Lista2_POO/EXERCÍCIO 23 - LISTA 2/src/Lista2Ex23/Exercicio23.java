package Lista2Ex23;


import Lista2Ex23.Circulo;
import Lista2Ex23.Quadrado;
import Lista2Ex23.Retangulo;
import Lista2Ex23.Triangulo;


public class Exercicio23{

	public static void main(String[] args) {
		 	Circulo circulo = new Circulo(2.3);
	        Quadrado quadrado = new Quadrado(5.0);
	        Retangulo retangulo = new Retangulo(6.0,3.0);
	        Triangulo triangulo = new Triangulo(8.0,4.0);
	        
	        circulo.calculaArea();
	        circulo.imprimir();
	        
	        quadrado.calculaArea();
	        quadrado.imprimir();
	        
	        retangulo.calculaArea();
	        retangulo.imprimir();
	        
	        triangulo.calculaArea();
	        triangulo.imprimir();
	}
}
