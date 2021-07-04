package code.soft.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String diaUtil,subStrings;
        int ano,mes, dia;

        System.out.println("Qual o ano de vencimento da fatura? ");
        ano = scan.nextInt();

        System.out.println("Qual o mes de vencimento da fatura? ");
        mes = scan.nextInt();

        System.out.println("Qual o dia de vencimento da fatura? ");
        dia = scan.nextInt();


        Calendar data = Calendar.getInstance();
        data.set(ano,mes-1,dia);
        data.add(Calendar.DATE, 10);
        diaUtil = data.getTime().toString();
        diaUtil = diaUtil.substring(0,3);

        if(diaUtil.equals("Sun"))
        {
            data.add(Calendar.DATE,1);
            System.out.println("Voce so podera pagar na seguinte data: " + data.getTime() );
        }

        else if(diaUtil.equals("Sat")){
            data.add(Calendar.DATE, 2);
            System.out.println("Voce so podera pagar na seguinte data: " + data.getTime());
        }
        else
            System.out.println("Voce precisa pagar ate: " + data.getTime());

    }

}
