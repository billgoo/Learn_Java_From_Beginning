package Chapter2._10InterfaceInheritPolym._4instanceof;

import java.sql.SQLClientInfoException;

class Quadrangle {                                  // 四边形类
    public static void draw(Quadrangle q){          // 四边形类中的方法
        System.out.println(q.getClass().getName());
    }
}

class Square extends Quadrangle{
    // SomeSentence
}

class Anything {
    // SomeSentence
}

public class Parallelogram extends Quadrangle {     // 平行四边形类
    public static void main(String[] args) {
        Quadrangle q = new Quadrangle();

        // 判断父类对象是否是子类的实例
        if (q instanceof Parallelogram) {
            Parallelogram p = (Parallelogram) q;
            System.out.println("p");
        }

        if (q instanceof Square) {
            Square s = (Square) q;
            System.out.println("s");
        }

        // q对象不是Anything的实例所以以下语句会报错
        // System.out.println(q instanceof Anything);
    }
}
