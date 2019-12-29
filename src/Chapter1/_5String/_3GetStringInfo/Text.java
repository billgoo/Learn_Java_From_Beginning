package Chapter1._5String._3GetStringInfo;

public class Text {
    public static void main(String[] args) {
        String str = "we are students";
        int size = str.lastIndexOf("");
        System.out.println("空字符在字符串中的位置" + size);
        System.out.println("字符串的长度" + str.length());
    }
}
