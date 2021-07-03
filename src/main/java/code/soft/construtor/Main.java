package code.soft.construtor;

public class Main
{
    public static void main(String[] args)
    {
        Car carro = new Car("Chevrolet","Olho de peixe", 2010,20000,6);
        //carro = new Car(5,1000);
        System.out.println(carro);

        System.out.println(carro.ligar());
    }
}
