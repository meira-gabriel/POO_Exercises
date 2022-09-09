package Lista2Ex23;

import java.lang.Math;


public class Circulo extends Area {

	public Circulo(double base){
        super(base);
    }
    
   
	@Override
	public void calculaArea(){
        this.setArea(this.getBase()*this.getBase()*Math.PI);
    }
    
    @Override
    public void imprimir(){
        System.out.print("A area do circulo mede "+this.getArea()+" cm2\n");
    }
}
