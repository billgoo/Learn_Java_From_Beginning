package Chapter2._10InterfaceInheritPolym._9Practice;

class Parent {
    public void fuckAZ(){
        System.out.println("父类.fuckAZ()");
    }

    public void fuckGL(){
        System.out.println("父类.fuckGL()");
    }

    public void fuckMSSJTU(){
        System.out.println("父类.fuckMSSJTU()");
    }
}

public class Test2 extends Parent {
    public void fuckMSSJTU(){
        System.out.println("子类.fuckMSSJTU()");
    }

    public static void main(String[] args) {
        Parent p = new Test2();
        p.fuckAZ();
        p.fuckGL();
        p.fuckMSSJTU();
        /**
         * output:
         * 父类.fuckAZ()
         * 父类.fuckGL()
         * 子类.fuckMSSJTU()
         */
    }
}
