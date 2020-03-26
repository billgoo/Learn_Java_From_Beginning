package Chapter2._10InterfaceInheritPolym._5OverLoad;

public class OverLoadTest2 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int... a) {   // 不定长参数列表，相当于int[] a
        // 定义不定长参数方法
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }

    public static int add(int a) {
        return 1;
    }

    public static int add(int a, double b) {
        return 1;
    }

    public static int add(double a, int b) {
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(2.1, 3.3));
        System.out.println(add(1));
        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(add(2)); // 调用add(int)
        /**
         * output:
         * 3
         * 5.4
         * 1
         * 45
         * 1
         */
    }
}
