package Chapter1._8Wrapper._2Boolean;

public class GetBoolean {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean("ok");
        Boolean b3 = Boolean.parseBoolean("ok");
        Boolean b4 = Boolean.valueOf("ok");

        System.out.println(b1);
        System.out.println(b1.booleanValue());
        System.out.println(b2.booleanValue());
        System.out.println(b3.booleanValue());
        System.out.println(b4.booleanValue());

        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TYPE);
    }
}
