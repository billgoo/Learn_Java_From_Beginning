package Chapter2._11AdvancedFeatures._5InnerClass;

interface OuterInterface2 {}

// 局部内部类，在一定定义域里
// 能访问类的成员和该定义域下的常量(final定义的变量)
class OuterClass3 {
    public OuterInterface2 doit(final String x) {
        class InnerClass2 implements OuterInterface2 {
            InnerClass2(String s) {
                s = x;
                System.out.println(s);
            }
        }
        return new InnerClass2(x);
    }
}

// 匿名内部类
/*
* return new A() {
*     内部类体
* };
* A指类名
* 类体之后要加分号
* */
class OuterClass4 {
    public OuterInterface2 doit(final String x) {
        return new OuterInterface2() {
            private int i = 0;
            private int getValue() {
                return i;
            }
        };
    }
}
