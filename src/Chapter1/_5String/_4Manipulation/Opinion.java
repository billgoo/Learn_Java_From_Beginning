package Chapter1._5String._4Manipulation;

public class Opinion {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("ABC");
        String s3 = new String("abc");

        boolean b = s1.equals(s2);
        boolean b2 = s1.equalsIgnoreCase(s2);

        System.out.println(b);
        System.out.println(b2);

    }
}
