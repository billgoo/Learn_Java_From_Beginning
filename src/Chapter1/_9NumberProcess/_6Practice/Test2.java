package Chapter1._9NumberProcess._6Practice;

import java.text.DecimalFormat;

public class Test2 {
    public static double GetArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static void SimpleFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat(pattern);
        System.out.println(myFormat.format(value));
    }

    public static void main(String[] args) {
        SimpleFormat("#.#####", GetArea(4));
        /**
         * 50.26548
         */
    }
}
