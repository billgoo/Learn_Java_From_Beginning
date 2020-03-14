package Chapter1._5String._9Practice;

public class Test3 {
    public static void main(String[] args) {
        String regex = "\\d{11}";
        String text = "12345678901";

        if (text.matches(regex)) {
            System.out.println("match");
        }
    }
}
