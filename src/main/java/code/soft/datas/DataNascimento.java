package code.soft.datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DataNascimento {

    public static void main(String[] args)
    {
        long millis = System.currentTimeMillis();
        Date date = new Date();
        Date compare = new Date();
        Boolean isAfter;

        compare = new Date(compare.parse("May 10, 2010"));
        date = new Date(date.parse("Aug 02, 2001"));

        isAfter = date.after(compare);

        System.out.println(date.getTime());
        System.out.println(isAfter);

    }
}
