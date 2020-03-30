package Chapter2._11AdvancedFeatures._3FinalMethod;

class Parent {
    private final void doit() {
        System.out.println("父类doit");
    }

    final void doit2() {
        System.out.println("父类doit2");
    }

    public void doit3() {
        System.out.println("父类doit3");
    }
}

class Sub extends Parent {
    public final void doit() {
        System.out.println("子类doit");
    }

// final方法不能覆盖
//    final void doit2() {
//        System.out.println("子类doit2");
//    }

    public void doit3() {
        System.out.println("子类doit3");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.doit();
        Parent p = s;
        // 不能调用private方法
        // p.doit();
        p.doit2();
        p.doit3();
        /**
         * output:
         * 子类doit
         * 父类doit2
         * 子类doit3
         * 子类doit是新方法
         * doit3是正常重写的方法
         */
    }
}
