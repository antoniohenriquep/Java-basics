package code.soft.interfaces;

public interface Carro
{
    String marca();
    String placa();
    int valor();

    default void ligar()
    {
        System.out.println("Ligando o carro vrum vrum");
    }

}
