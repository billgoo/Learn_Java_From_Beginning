package Chapter2._12Exception._2HandleException;

public class Thundering {
    public static void main(String[] args) {
        String str = "lili";
        System.out.println(str + "年龄是：");
        int age = Integer.parseInt("20L");
        System.out.println(age);
        /**
         * output:
         * lili年龄是：
         * Exception in thread "main" java.lang.NumberFormatException: For input string: "20L"
         * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
         * 	at java.base/java.lang.Integer.parseInt(Integer.java:658)
         * 	at java.base/java.lang.Integer.parseInt(Integer.java:776)
         * 	at Chapter2._12Exception._2HandleException.Thundering.main(Thundering.java:7)
         */
    }
}
