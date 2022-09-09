package exercicio21;

import java.util.Date;

public class Emprestimo {
	
	private Pessoa pessoa;
    private Livro livro;
    private Date dtEmprestimo;

    public Emprestimo(Pessoa pessoa, Livro livro, Date dtEmprestimo) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dtEmprestimo = dtEmprestimo;
    }  

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDt_emprestimo() {
        return dtEmprestimo;
    }

    public void setDt_emprestimo(Date dt_emprestimo) {
        this.dtEmprestimo = dt_emprestimo;
    }
    
    
    
}