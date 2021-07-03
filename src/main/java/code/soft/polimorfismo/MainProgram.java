package code.soft.polimorfismo;

public class MainProgram {

    public static void main(String[] args)
    {
        Gerente gerente = new Gerente();
        gerente.setSalario(10000.0);
        System.out.println("Valor a pagar: " + gerente.imposto());
    }
}
