package Chapter1._8Wrapper._4Character;

public class UpperOrLower {
    public static void main(String[] args) {
        Character mychar1 = 'A';
        Character mychar2 = new Character('a');

        System.out.println("是大写：" + Character.isUpperCase(mychar1));
        System.out.println("是小写：" + Character.isLowerCase(mychar2));
    }
}
