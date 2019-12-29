package Chapter1._4FlowControl._6Practice;
/**
 * 打印菱形
 */

public class Test2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= Math.abs(2 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - 2 * Math.abs(2 - i); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= Math.abs(2 - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
