package Chapter2._11AdvancedFeatures._5InnerClass;

public class OutputInnerClass extends ClassA.ClassB {
    public OutputInnerClass (ClassA a){
        a.super();
        /**
         * 继承内部类时，要硬性设置一个带参构造方法
         * 且参数为继承的内部类的外部类的引用
         * 并在方法体中写super
         */
    }
}

class ClassA {
    class ClassB {

    }
}