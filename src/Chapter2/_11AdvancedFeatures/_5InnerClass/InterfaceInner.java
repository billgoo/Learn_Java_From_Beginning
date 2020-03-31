package Chapter2._11AdvancedFeatures._5InnerClass;

import org.ietf.jgss.Oid;

interface OutInterface {
    public void f();
}

public class InterfaceInner {
    public static void main(String[] args) {
        OuterClass2 out = new OuterClass2();
        OutInterface outinter1 = out.doit1();
        OutInterface outinter2 = out.doit2();

        outinter1.f();
        outinter2.f();
        /**
         * output:
         * 访问内部类1构造方法
         * 访问内部类2构造方法
         * 访问内部类1中的f()方法
         * 访问内部类2中的f()方法
         *
         * 内部类向上转型为接口，可以在同一类中使用不同内部类，
         * 多次实现接口中的同一方法。
         */
    }
}

class OuterClass2 {
    private class InnerClass1 implements OutInterface {
        InnerClass1(String s) {
            System.out.println(s);
        }

        public void f() {
            System.out.println("访问内部类1中的f()方法");
        }
    }

    private class InnerClass2 implements OutInterface {
        InnerClass2(String s) {
            System.out.println(s);
        }

        public void f() {
            System.out.println("访问内部类2中的f()方法");
        }
    }

    public OutInterface doit1() {
        return new InnerClass1("访问内部类1构造方法");
    }

    public OutInterface doit2() {
        return new InnerClass2("访问内部类2构造方法");
    }
}
