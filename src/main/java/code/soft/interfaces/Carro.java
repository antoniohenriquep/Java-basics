package code.soft.interfaces;

public interface Carro implements Veiculo
{
    String marca();
    String placa();
    Double valor();

    default void ligar()
    {
        System.out.println("Ligando o carro vrum vrum");
    }

}
