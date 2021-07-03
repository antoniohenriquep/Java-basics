package code.soft.polimorfismo;

public class Gerente extends Funcionario
{
    public Double imposto()
    {
        return this.getSalario()*0.001;
    }
}
