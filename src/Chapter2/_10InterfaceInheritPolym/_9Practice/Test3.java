package Chapter2._10InterfaceInheritPolym._9Practice;

public abstract class Test3 {
    abstract void testAbstract();
    Test3(){                                         //（1）首先执行父类构造方法
        System.out.println("before testAbstract()");
        testAbstract();                                 //如果调用了抽象方法，调用子类覆盖的方法。这里调用Atest类的testAbstract（）方法
        System.out.println("after testAbstract()");
    }

    public static void main(String args[]){
        new subTest3();
        /**
         * output:
         * before testAbstract()
         * testAbstract()：0
         * after testAbstract()
         * 子类构造方法：1
         */
    }
}

class subTest3 extends Test3{
    private int i = 1;                            //（2）使成员变量进行初始化

    void testAbstract(){
        System.out.println("testAbstract()：" + i);
    }

    public subTest3(){                             //（3）调用子类构造方法
        System.out.println("子类构造方法：" + i);
    }
}