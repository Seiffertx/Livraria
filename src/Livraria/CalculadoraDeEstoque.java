package Livraria;

public class CalculadoraDeEstoque
{
    public static void main(String[] args)
    {
        double livroJava8 = 59.90;
        double livroTDD = 59.90;
        double soma = 0;
        Autor autor = new Autor();

        Livro livro = new LivroFisico(autor);

        for (double i=0; i< 35; i++)
        {
            soma += 59.90;
        }

        System.out.println("O total em estoque é "+soma);

        if(soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if(soma >= 200) {
        System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom!");
        }
    }
}
