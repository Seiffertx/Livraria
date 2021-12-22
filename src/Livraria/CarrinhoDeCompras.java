package Livraria;

public class CarrinhoDeCompras
{
    private double total;

    public void adiciona(Produto produto)
    {
        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
    }

    public void adiciona(Livro livro)
    {
        //Ebook ebook = (Ebook) livro;
        //rebook.getWaterMark();
        System.out.println("Adicionando: " + livro);
        //livro.aplicaDescontoDe(0.05);
        total += livro.getValor();
    }

    public void adiciona(Revista revista)
    {
        System.out.println("Adicionando: " + revista);
        revista.aplicaDescontoDe(0.05);
        total += revista.getValor();
    }

    public double getTotal()
    {
        return total;
    }
}
