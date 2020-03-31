package Chapter2._11AdvancedFeatures._4FinalClass;

final class FinalClass {
    int a = 3;
    void doit() {}

    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.a++;
        System.out.println(f.a);
    }
}
