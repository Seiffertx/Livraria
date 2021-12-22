package Livraria;

public class ExecutandoLivros
{
    public static void main(String[] args)
    {
        Autor autor = new Autor();

        Livro livro1 = new LivroFisico(autor);
        Livro livro2 = new LivroFisico(autor);
        Livro livro3 = new LivroFisico(autor);
        Livro livro4 = new LivroFisico(autor);
    }
}
