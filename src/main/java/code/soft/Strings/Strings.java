package code.soft.Strings;

import java.util.Locale;

public class Strings {

    public static void main(String[] args)
    {
        var nome = "Antonio";
        var sobrenome = "Pedreira";
        final var nomeCompleto = nome + sobrenome;

        System.out.println(nomeCompleto);

        var string = new String(" Meu nome eh Antonio ");

        System.out.println("Char na posicao: "+ string.charAt(5));
        System.out.println("Tamanho da String: "+ string.length());
        System.out.println("Sem trim ["+ string + "]");
        System.out.println("Com trim ["+ string.trim() + "]");
        System.out.println("Minusculo: " + string.toLowerCase());
        System.out.println("Maiusculo: " + string.toUpperCase());
        System.out.println("Contem A? " + string.contains("A"));
        System.out.println("Replace: " + string.replace('A','o'));


        System.out.println("A B C D E".toCharArray());
        System.out.println("Aula de java".split(" "));
        System.out.println("1234 asdedw hgr".replaceAll("[0-9]","#"));
    }
}
