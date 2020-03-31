package Chapter2._11AdvancedFeatures._5InnerClass;

public class OuterClass {
    // 内部类的对象实例化必须要在外部类或外部类的静态方法中
    innerClass in = new innerClass();

    public void outf() {
        in.inf();
    }

    class innerClass {
        innerClass() {}
        public void inf() {}
        int y = 0;
    }

    public innerClass doit() {
        in.y = 4;
        return new innerClass();
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.innerClass in = out.doit();
        OuterClass.innerClass in2 = out.new innerClass();
    }
}
