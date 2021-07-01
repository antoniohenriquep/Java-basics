package code.soft.interfaces;

public class Opala implements Carro{


    @Override
    public String marca() {
        return "Chevrolet";
    }

    @Override
    public String placa() {
        return "AAA-0000";
    }

    @Override
    public int valor() {
        return 10000;
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
    }
}
