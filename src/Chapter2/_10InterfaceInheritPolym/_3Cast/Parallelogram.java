package Chapter2._10InterfaceInheritPolym._3Cast;
class Quadrangle {                                  // 四边形类
    public static void draw(Quadrangle q){          // 四边形类中的方法
        System.out.println(q.getClass().getName());
    }
}

public class Parallelogram extends Quadrangle {     // 平行四边形类
    public static void main(String[] args) {
        Parallelogram p = new Parallelogram();      // 实例化平行四边形类的对象
        draw(p);                                    // 调用父类方法
        /**
         * output:
         * Chapter2._10InterfaceInheritPolym._3Cast.Parallelogram
         *
         * 对象向上转型的例子
         */

        /**
        * Quadrangle q = new Parallelogram();
        * Parallelogram p = q;    // 报错
        * // 要使用显示类型转换才行
        * Parallelogram p = (Parallelogram) q;
        */
    }
}
