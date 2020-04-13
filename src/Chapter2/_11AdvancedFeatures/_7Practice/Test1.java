package Chapter2._11AdvancedFeatures._7Practice;

public class Test1 {
    public OutInterface doit(final String s) {
        return new OutInterface() {
            private int i = 0;
            public int getValue() {
                System.out.println(s);
                return i;
            }
        };
    }
}

interface OutInterface {
}
