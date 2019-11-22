package Chapter3._3Foundation._4Ops;

public class Arith {
    public static void main(String[] args) {
        int a = 4;
        int b = ++a;    // 先加再赋值
        System.out.println(a);
        System.out.println(b);
        int c = a++;    // 先赋值再加
        System.out.println(a);
        System.out.println(c);
        //5
        //5
        //6
        //5
    }
}
