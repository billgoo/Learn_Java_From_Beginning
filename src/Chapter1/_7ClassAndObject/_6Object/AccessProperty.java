package Chapter1._7ClassAndObject._6Object;

public class AccessProperty {
    static int i = 47;
    int j = 47;

    public void call(String flag) {
        System.out.println("调用call方法");
        if (flag.equals("i")) {
            for (i = 0; i < 3; i++) {
                System.out.print(i + " ");
                if (i == 2) {
                    System.out.println("\n");
                }
            }
        }
        else if (flag.equals("j")) {
            for (j = 0; j < 3; j++) {
                System.out.print(j + " ");
                if (j == 2) {
                    System.out.println("\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        AccessProperty t1 = new AccessProperty();
        AccessProperty t2 = new AccessProperty();
        t2.i = 60;
        t2.j = 60;

        System.out.println("t1调用i的结果：" + t1.i++);
        t1.call("i");
        System.out.println("t2调用i的结果：" + t2.i);
        t2.call("i");

        System.out.println("t1调用i的结果：" + t1.j++);
        t1.call("j");
        System.out.println("t1调用i的结果：" + t2.j);
        t2.call("j");

        /**
         * output:
         * t1调用i的结果：60
         * 调用call方法
         * 0 1 2
         *
         * t2调用i的结果：3
         * 调用call方法
         * 0 1 2
         *
         * t1调用i的结果：47
         * 调用call方法
         * 0 1 2
         *
         * t1调用i的结果：60
         * 调用call方法
         * 0 1 2
         */
    }
}
