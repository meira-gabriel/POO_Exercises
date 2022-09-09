package Lista2Ex23;

public class Triangulo extends Area {
	
	private double altura;
    
    public Triangulo(double base, double altura){
        super(base);
        this.altura=altura;
                
    }
    
    @Override
    public void calculaArea(){
        this.setArea((this.getBase()*this.altura)/2);
    }
    
    @Override
    public void imprimir(){
        System.out.print("A area do triangulo mede "+this.getArea()+" cm2\n");
    }

}
