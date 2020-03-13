package Chapter1._5String._4Manipulation;

public class NewStr {
    public static void main(String[] args) {
        String str = "address";
        String newstr1 = str.replace("a", "A");
        // 出现多次会全部替换
        String newstr2 = str.replace("s", "S");

        System.out.println(newstr1);
        System.out.println(newstr2);
    }
}
