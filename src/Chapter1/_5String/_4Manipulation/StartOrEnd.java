package Chapter1._5String._4Manipulation;

public class StartOrEnd {
    public static void main(String[] args) {
        String num1 = "22045612";
        String num2 = "21304578";

        boolean b = num1.startsWith("22");
        boolean b2 = num1.endsWith("78");
        boolean b3 = num2.startsWith("22");
        boolean b4 = num2.endsWith("78");

        System.out.println(b);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
