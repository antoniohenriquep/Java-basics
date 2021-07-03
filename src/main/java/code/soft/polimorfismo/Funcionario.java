package code.soft.polimorfismo;

public class Funcionario {

    private Double salario, aliquota;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }

    public Double imposto()
    {
        return this.salario;
    }

}
