package Chapter1._8Wrapper._8Practice;

public class Test2 {
    public static void main(String[] args) {
        Character c1 = 'A';
        Character c2 = 'a';

        System.out.println(c1.equals(c2));

        Character c3 = Character.toLowerCase(c1);

        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
    }
}
