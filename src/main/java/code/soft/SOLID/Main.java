package code.soft.SOLID;

public class Main {
    public static void main(String[] args)
    {
        ControladorDesconto controladorDesconto = new ControladorDesconto();
        DescontoSedan descontoSedan = new DescontoSedan();

        System.out.println(controladorDesconto.addDesconto(descontoSedan));
    }
}
