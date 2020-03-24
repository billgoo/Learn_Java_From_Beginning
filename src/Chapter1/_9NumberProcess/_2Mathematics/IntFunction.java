package Chapter1._9NumberProcess._2Mathematics;

public class IntFunction {
    public static void main(String[] args) {
        System.out.println(Math.ceil(5.2));
        System.out.println(Math.floor(2.5));
        System.out.println(Math.rint(2.7));
        System.out.println(Math.rint(2.5));
        System.out.println(Math.round(3.4f));   // 返回int
        System.out.println(Math.round(2.5));    // 返回long
        /**
         * output:
         * 6.0
         * 2.0
         * 3.0
         * 2.0
         * 3
         * 3
         */
    }
}
