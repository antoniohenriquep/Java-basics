package code.soft.construtor;

public abstract class Veiculo
{
    private Integer capacidade, vendido;
    public Veiculo(Integer capacidade, Integer vendido)
    {
        this.capacidade = capacidade;
        this.vendido = vendido;
    }

    public String ligar(){
        return "Vrum Vrum Vrum!";
    }

    @Override
    public String toString(){
        return "\nvendido: " + vendido + "\ncapacidade: " + capacidade;
    }
}
