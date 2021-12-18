package Livraria;

public class CadastroDeLivros
{
    public static void main(String[] args)
    {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCPF("123.456.789-10");

        Livro livro = new Livro();
        livro.setNome("Java 8 Prático");
        if(livro.getNome().length() < 2)
        {
            System.out.println(" ATENÇÃO - Nome inválido " + livro.getNome().length());
        }
        livro.setDescricao("Novos Recursos da linguagem");
        livro.setValor(59.90);
        livro.setISBN("978-85-66250-46-6");

        livro.setAutor(autor);

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCPF("123.456.789-10");

        Livro outroLivro = new Livro();
        outroLivro.setNome("Lógica de Programação");
        if(outroLivro.getNome().length() < 2)
        {
            System.out.println(" ATENÇÃO - Nome inválido " + outroLivro.getNome().length());
        }
        outroLivro.setDescricao("Crie seus proprios programas");
        outroLivro.setValor(59.90);
        outroLivro.setISBN("978-85-66250-22-0");

        outroLivro.setAutor(outroAutor);

        outroLivro.mostrarDetalhes();

        Ebook ebook = new Ebook();
        ebook.setNome("Java 8 Pratico");
    }
}
