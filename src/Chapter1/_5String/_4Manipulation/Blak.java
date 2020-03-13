package Chapter1._5String._4Manipulation;

public class Blak {
    public static void main(String[] args) {
        String str = "   java  class  ";
        System.out.println(str.length());
        // 去掉头部和尾部空格的长度
        System.out.println(str.trim().length());
    }
}
