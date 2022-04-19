package data_e_calendario;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class calendario {
    public static void main(String[] args) {
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date dat = Date.from(Instant.parse("2022-03-20T06:14:57Z"));

        System.out.println(date2.format(dat));

        Calendar cal = Calendar.getInstance();
        cal.setTime(dat);
        cal.add(Calendar.HOUR_OF_DAY, 10);
        dat = cal.getTime();

        System.out.println(date2.format(dat));
    }
}
