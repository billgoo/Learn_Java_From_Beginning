package DataType;

public class CharType {
    public static void main(String[] args) {
        char word = 'd', word2 = '@';
        int p = 23045, p2 = 45213;
        System.out.println("d在Unicode表的位置："+(int)word);
        System.out.println("@在Unicode表的位置："+(int)word2);
        System.out.println("Unicode表第23045位置："+(char)p);
        System.out.println("Unicode表第45213位置："+(char)p2);
        //d在Unicode表的位置：100
        //@在Unicode表的位置：64
        //Unicode表第23045位置：娅
        //Unicode表第45213位置：낝

        char c1 = '\\';
        char char1 = '\u2605';
        System.out.println(c1);
        System.out.println(char1);
        //\
        //★
    }
}
