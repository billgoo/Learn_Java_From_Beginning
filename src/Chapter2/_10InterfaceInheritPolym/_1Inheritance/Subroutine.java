package Chapter2._10InterfaceInheritPolym._1Inheritance;
class Parent {
    Parent() {
        System.out.println("调用父类构造方法");
    }
}

class SubParent  extends Parent {
    SubParent() {
        System.out.println("调用子类构造方法");
    }
}

public class Subroutine extends SubParent {
    Subroutine() {
        System.out.println("调用子类的子类构造方法");
    }

    public static void main(String[] args) {
        Subroutine s = new Subroutine();
        /**
         * 调用父类构造方法
         * 调用子类构造方法
         * 调用子类的子类构造方法
         */
    }
}
