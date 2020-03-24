package Chapter1._9NumberProcess._1NumberFormat;

import java.text.DecimalFormat;

public class DecimalMethod {
    public static void main(String[] args) {
        DecimalFormat myFormat = new DecimalFormat();
        myFormat.setGroupingSize(2);
        String output = myFormat.format(123456.789);
        System.out.println(output);

        myFormat.setGroupingUsed(false);
        String output2 = myFormat.format(123456.789);
        System.out.println(output2);
        /**
         * 12,34,56.789
         * 123456.789
         */
    }
}
