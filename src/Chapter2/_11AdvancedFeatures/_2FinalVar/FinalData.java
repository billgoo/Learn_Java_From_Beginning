package Chapter2._11AdvancedFeatures._2FinalVar;

import static java.lang.System.out;

import java.util.Random;

class Test {
    int i = 0;
}

public class FinalData {
    static Random rand = new Random();
    private final int VALUE_1 = 9;
    private static final int VALUE_2 = 10;
    private final Test test = new Test();
    private Test test2 = new Test();
    private final int[] a = {1, 2, 3, 4, 5, 6};
    private final int i4 = rand.nextInt(20);
    private static final int i5 = rand.nextInt(20);

    public String toString() {
        return i4 + " " + i5 + " ";
    }

    public static void main(String[] args) {
        FinalData data = new FinalData();

        // 可以对指定为final的引用中的成员变量赋值
        // 不能把final的引用指向其他引用，不然会报错
        // data.test = new Test();
        data.test2 = new Test();

        // 不能改变final的常量值
        // data.VALUE_2++;

        for (int i = 0; i < data.a.length; i++) {
            data.a[i] = 9;      // 不知道为什么被定义为final的数组的值被改变了
            out.print(data.a[i] + " ");
        }
        out.println();

        out.println(data);
        out.println("data2");
        out.println(new FinalData());
        out.println(data);
        /**
         * output:
         * 999999
         * 18 14
         * data2
         * 12 14
         * 18 14
         * 因为是static所以i5从开辟地址空间之后始终是不变的
         * 一个既是static也是final的变量占据一段不能改变的地址空间
         * final的对象引用不可改变但是本身的值可以改变，所以i4是会改变的
         * 但是i5是static final所以始终不会变
         *
         * 被定义为final的数组的值被改变了？？？
         */
    }
}
