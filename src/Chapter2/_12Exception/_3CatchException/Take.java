package Chapter2._12Exception._3CatchException;

public class Take {
    public static void main(String[] args) {
        try {
            String str = "lili";
            System.out.println(str + "年龄是：");
            int age = Integer.parseInt("20L");
            System.out.println(age);
        } catch (Exception e) {
            e.printStackTrace();    // 输出异常性质，可以继续执行12行
        }
        System.out.println("program over");
        /**
         * output:
         * lili年龄是：
         * program over
         * java.lang.NumberFormatException: For input string: "20L"
         * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
         * 	at java.base/java.lang.Integer.parseInt(Integer.java:658)
         * 	at java.base/java.lang.Integer.parseInt(Integer.java:776)
         * 	at Chapter2._12Exception._3CatchException.Take.main(Take.java:8)
         */
    }
}
