package code.soft.poo;
import java.util.Scanner;


public class Carro {

    private Scanner scan = new Scanner(System.in);
    private int pessoas = 4, quantidade;
    private String resposta;

    public void setPessoas() {

        Pessoa pessoa = new Pessoa();

        System.out.println("Voce deseja adicionar ou remover?");
        resposta = scan.next();

        System.out.println("Quantas?");
        quantidade = scan.nextInt();

        if(resposta.equals("add"))
                pessoas += quantidade;
        else
            pessoas -= quantidade;

        System.out.println(resposta);
    }

    public int getPessoas() {
        return pessoas;
    }
}
