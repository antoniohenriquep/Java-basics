package code.soft.datas;

import java.util.Date;

public class Exemplo
{
    public static void main(String[] args)
    {
        //Pegar data atual
        long currentTime = System.currentTimeMillis();

        Date novaData = new Date(currentTime);
        Date data = new Date();

        data = new Date(data.getTime());


        System.out.println(novaData);
        System.out.println(data);
    }
}
