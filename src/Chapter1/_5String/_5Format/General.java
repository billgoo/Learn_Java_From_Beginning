package Chapter1._5String._5Format;

public class General {
    public static void main(String[] args) {
        System.out.println("400的一半是" + String.format("%d", 400 / 2));
        System.out.println("3 > 5正确吗" + String.format("%b", 3 > 5));
        System.out.println("200的十六进制" + String.format("%x", 200));
    }
}
