package Chapter1._4FlowControl._6Practice;
/**
 * 打印 1+1/2！+1/3！+...+1/20！
 */

public class Test3 {
    public static void main(String[] args) {
        double result = 0, i = 1;
        while (i <= 20) {
            double down = 1;
            for (int j = 1; j <= i; j++) {
                down *= j;
            }
            result += 1 / down;
            i++;
        }
        System.out.println(result);
    }
}
