package Chapter1._5String._5Format;

import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format("%tc", date));
        System.out.println(String.format("%tF", date));
    }
}
