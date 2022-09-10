package exercicio21;

import java.util.Date;

public class Biblioteca {

public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa ("Beltrano", "112.762-84");
        Pessoa p2 = new Pessoa ("Ciclano", "345.488-21");
        
        Livro l1 = new Livro ("Doze", "Maria Silva", "Galera");
        Livro l2 = new Livro ("O segredo de Isabella", "Maria Silva", "Galera");
        
        Date d1 = new Date(2022, 05, 01);
        
        
        Emprestimo e1 = new Emprestimo(p1, l2, d1);
        
        System.out.println(e1.getPessoa().getNome());
        System.out.println(e1.getLivro().getTitulo());
        System.out.println(e1.getDt_emprestimo());
      
    }
    
}
