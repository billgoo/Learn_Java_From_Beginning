package Chapter1._5String._4Manipulation;

public class Wordbook {
    public static void main(String[] args) {
        String str = "b";
        String str2 = "a";
        String str3 = "c";
        String str4 = "B";

        System.out.println(str + " compare to " + str2 + ":"
                             + str.compareTo(str2));
        System.out.println(str + " compare to " + str3 + ":"
                + str.compareTo(str3));
        System.out.println(str + " compare to " + str4 + ":"
                + str.compareTo(str4));
        System.out.println(str + " compare to " + str4 + ":"
                + str.compareToIgnoreCase(str4));
    }
}
