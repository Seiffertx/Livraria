package Livraria;

public abstract class Livro implements Produto
{
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

/*    public Livro()
    {
        System.out.println("Novo livro criado");
    }*/

    public Livro(Autor autor)
    {
        this();
        this.autor = autor;
        this.impresso = true;
    }

    public Livro()
    {
        this.isbn = "000-00-00000-00-0";
    }


    boolean temAutor()
    {
        return this.autor != null;
    }

    void setValor(double valor)
    {
        this.valor = valor;
    }

    public double getValor()
    {
        return this.valor;
    }

    void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return this.descricao;
    }

    void setISBN(String isbn)
    {
        this.isbn = isbn;
    }

    public String getISBN()
    {
        return this.isbn;
    }

    void setAutor(Autor autor)
    {
        this.autor = autor;
    }

    public Autor getAutor()
    {
        return this.autor;
    }
    void mostrarDetalhes()
    {
        String mensagem = "Mostrando detalhes do Livro";
        System.out.println(mensagem);
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor Atual: R$"+valor);
        System.out.println("ISBN: "+isbn);
        if (this.temAutor())
        {
            autor.mostrarDetalhes();
        }
        System.out.println("--");
    }
}
