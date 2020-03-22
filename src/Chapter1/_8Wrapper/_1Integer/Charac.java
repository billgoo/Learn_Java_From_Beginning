package Chapter1._8Wrapper._1Integer;

public class Charac {
    public static void main(String[] args) {
        String str = Integer.toString(456);
        String str2 = Integer.toBinaryString(456);
        String str3 = Integer.toOctalString(456);
        String str4 = Integer.toHexString(456);

        System.out.println("十进制：" + str);
        System.out.println("二进制：" + str2);
        System.out.println("八进制：" + str3);
        System.out.println("十六进制：" + str4);

        int maxint = Integer.MAX_VALUE;
        int minint = Integer.MIN_VALUE;
        int intsize = Integer.SIZE;
        Class<Integer> inttype = Integer.TYPE;

        System.out.println("Int值的最大数" + maxint);
        System.out.println("Int值的最小数" + minint);
        System.out.println("Int值的补码表示的长度（位数）" + intsize);
        System.out.println("Int值的类型" + inttype);
    }
}
