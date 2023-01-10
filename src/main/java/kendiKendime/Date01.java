package kendiKendime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Date01 {

    public static void main(String[] args) {

        Date myDate=new Date();
        System.out.println(myDate );

        System.out.println( LocalDate.now());

        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println(LocalDateTime.now(ZoneId.of("Europa/Vienna")));



    }
}
