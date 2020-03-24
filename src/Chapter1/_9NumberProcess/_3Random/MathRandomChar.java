package Chapter1._9NumberProcess._3Random;

public class MathRandomChar {
    public static char GetRandomChar(char c1, char c2) {
        return (char)(c1 + Math.random() * (c2 - c1 + 1));
    }

    public static void main(String[] args) {
        System.out.println(GetRandomChar('a', 'z'));
        System.out.println(GetRandomChar('A', 'Z'));
        System.out.println(GetRandomChar('0', '9'));
    }
}
