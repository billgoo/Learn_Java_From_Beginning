package Chapter1._7ClassAndObject._3Constructor;

public class AnyThing {
    static double PI = 3.14;    // 静态方法里不能直接调用非静态方法，不能用this关键字

    public AnyThing() {
        this("this调用有参构造方法");   // 使用this调用有参构造方法
        System.out.println("无参构造方法");
    }

    public AnyThing(String name) {
        System.out.println("有参构造方法");
    }
    /**
     * 有参构造方法
     * 无参构造方法
     */
}
