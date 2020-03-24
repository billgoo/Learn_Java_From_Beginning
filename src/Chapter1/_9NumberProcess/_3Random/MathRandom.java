package Chapter1._9NumberProcess._3Random;

public class MathRandom {
    public static int GetEvenNumber(double num1, double num2) {
        int s = (int)num1 + (int)(Math.random() * (num2 - num1));
        if (s % 2 == 0) {
            return s;
        } else {
            return s + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(GetEvenNumber(2, 32));
    }
}
