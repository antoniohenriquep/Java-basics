package code.soft.poo;

public class Programaa
{

    public static void main(String[] args)
    {
        Carro carro = new Carro();

        System.out.println(carro.getPessoas());

        carro.setPessoas();

        System.out.println(carro.getPessoas());
    }
}
