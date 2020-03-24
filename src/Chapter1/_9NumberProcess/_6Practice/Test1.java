package Chapter1._9NumberProcess._6Practice;

public class Test1 {
    public static int GetEvenNumber(double num1, double num2) {
        int count = 0;
        int sum = 0;
        while (count < 6) {
            int s = (int)num1 + (int)(Math.random() * (num2 - num1));
            if (s % 2 == 0) {
                count++;
                sum += s;
                System.out.println(s);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(GetEvenNumber(2, 32));
    }
}
