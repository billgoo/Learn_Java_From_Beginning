package Chapter2._11AdvancedFeatures._5InnerClass;

public class TheSameName {
    private int x;
    private class InnerClass {
        private int x = 9;
        private void doit(int x) {
            x++;                    // 形参
            this.x++;               // 内部的
            TheSameName.this.x++;   // 外部的
            // TheSameName.this可以获得外部类的一个引用
        }
    }
}
