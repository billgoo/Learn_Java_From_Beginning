package Chapter1._5String._5Format;

import java.util.Date;

public class Eval {
    public static void main(String[] args) {
        Date date = new Date();
        String year = String.format("%tY", date);
        String month = String.format("%tB", date);
        String day = String.format("%td", date);
        System.out.println(year + "年 " + month + " " + day + "日");
    }
}
