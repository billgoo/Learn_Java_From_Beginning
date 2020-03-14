package Chapter1._5String._5Format;

public interface Judge {
    public static void main(String[] args) {
        String regex = "\\w+@+\\w+(\\.\\w{2,3})*\\.\\w{2,3}";   // 加号之间不能有空格，不然不会匹配
        String str1 = "aaa@";
        String str2 = "aaaaa";
        String str3 = "1111@111ffyu.dfg.com";

        String msg = "是合法的Email地址";

        if (str1.matches(regex)) {
            System.out.println(str1 + msg);
        } else if (str2.matches(regex)) {
            System.out.println(str2 + msg);
        } else if (str3.matches(regex)) {
            System.out.println(str3 + msg);
        }

        if (str1.matches(str3)) {
            System.out.println(msg);
        } else {
            System.out.println("不" + msg);
        }
    }
}
