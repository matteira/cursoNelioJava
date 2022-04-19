package data_e_calendario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = date.parse("04/01/2002");
        Date y2 = date2.parse("12/03/2000 23:30:50");

        System.out.println("Data sem hora: " + date.format(y1));
        System.out.println("Data com hora: " + date2.format(y2));

        Date atual = new Date();
        System.out.println("Data com hora atual: " + date2.format(atual));

    }
}
