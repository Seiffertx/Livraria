package Livraria;

public class Autor
{
    private String nome;
    private String email;
    private String cpf;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setCPF(String cpf)
    {
       this.cpf = cpf;
    }

    public String getCPF()
    {
        return cpf;
    }


    void mostrarDetalhes()
    {
        System.out.println("-> Mostrando detalhes do Autor");
        System.out.println("Nome: "+nome);
        System.out.println("E-mail: "+email);
        System.out.println("CPF: "+cpf);
    }
}
