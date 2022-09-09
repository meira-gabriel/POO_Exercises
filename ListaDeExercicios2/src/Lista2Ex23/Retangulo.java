package Lista2Ex23;

public class Retangulo extends Area {
	
	 private double altura;
	    
	    public Retangulo(double base, double altura){
	        super(base);
	        this.altura=altura;
	                
	    }
	    
	    @Override
	    public void calculaArea(){
	        this.setArea(this.getBase()*this.altura);
	    }
	    
	    @Override
	    public void imprimir(){
	        System.out.print("A area do retangulo mede "+this.getArea()+" cm2\n");
	    }

}
