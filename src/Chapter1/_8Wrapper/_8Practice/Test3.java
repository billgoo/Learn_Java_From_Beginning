package Chapter1._8Wrapper._8Practice;

public class Test3 {
    public static void main(String[] args) {
        Character c = 'o';

        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf(c.toString());

        System.out.println(c);

        System.out.println(b1.booleanValue());
        System.out.println(b2.booleanValue());

        System.out.println();

        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
