package code.soft.interfaces;

public class Programa {

    public static void main(String[] args){
        final Opala opala = new Opala();

        System.out.println("A marca do carro eh:" + opala.marca());
        opala.ligar();

        for (TiposDeDados tipo: TiposDeDados.values()){
            System.out.println("Tipo:" +tipo);
        }
    }
}
