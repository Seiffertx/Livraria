package Livraria;

public class Ebook extends Livro
{
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private String watermark;

    public Ebook() {

    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem)
    {
        if (porcentagem > 0.15)
        {
            return false;
        }
        //return super.aplicaDescontoDe(porcentagem);
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }

    public void setWaterMark(String waterMark)
    {
        this.watermark = waterMark;
    }

    public String getWaterMark()
    {
        return this.watermark;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public double getValor()
    {
        return this.valor;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getIsbn()
    {
        return this.isbn;
    }

    public void setAutor(Autor autor)
    {
        this.autor = autor;
    }

    public Ebook(Autor autor)
    {
        super(autor);
    }
}
