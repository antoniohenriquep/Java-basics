package code.soft.construtor;

public class Car extends Veiculo
{
    private String marca, modelo, variante;
    private Integer ano;

    public Car(String marca, String modelo, Integer ano, Integer vendido, Integer capacidade)
    {
        super(vendido,capacidade);
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }





    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString()
    {
        return "modelo :" + modelo + "\nmarca:" + marca + "\nano: " + ano + super.toString();
    }


}
