package exercicio22;

public class Main {

   
    public static void main(String[] args) {
        
       Pessoa p1 = new Pessoa ("Paulo Lopes", 50);
       Pessoa p2 = new Pessoa ("Sonia Maria", 40);
       Pessoa p3 = new Pessoa ("Tiago Santos", 35);
       
       Pessoa p4 = new Pessoa ("Maria dos Santos", 49);
       Pessoa p5 = new Pessoa ("Carla Regina", 55);
       Pessoa p6 = new Pessoa ("Roberto Gomes", 32);
       
       
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Pai: " + p3.getNome());
        System.out.println("Mae: " + p2.getNome());
        System.out.println("------------------------");
        System.out.println("Nome: " + p4.getNome());
        System.out.println("Idade: " + p4.getIdade());
        System.out.println("Pai: " + p6.getNome());
        System.out.println("Maae: " + p5.getNome());
        System.out.println("------------------------");
        
    }
    
}