package Chapter1._5String._4Manipulation;

public class Division {
    public static void main(String[] args) {
        String str = "192.168.0.1";

        String[] firstArray = str.split("\\.");
        String[] secondArray = str.split("\\.", 2);

        System.out.println("[" + str + "]");

        for (String a: firstArray) {
            System.out.print("[" + a + "]");
        }

        System.out.println();

        for (String a: secondArray) {
            System.out.print("[" + a + "]");
        }

        System.out.println();
    }
}
