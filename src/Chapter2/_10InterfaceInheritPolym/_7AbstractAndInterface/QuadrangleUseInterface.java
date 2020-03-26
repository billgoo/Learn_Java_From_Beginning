package Chapter2._10InterfaceInheritPolym._7AbstractAndInterface;
interface drawTest {    // public会报错
    public void draw();
}

class ParallelogramUseInterface extends QuadrangleUseInterface
    implements drawTest {
    public void draw() {
        System.out.println("平行四边形的draw");
    }

    void doAnything() {
        // Sentences
    }
}

class SquareUseInterface extends QuadrangleUseInterface
        implements drawTest {
    public void draw() {
        System.out.println("正方形的draw");
    }

    void doAnything() {
        // Sentences
    }
}

class AnythingUseInterface extends QuadrangleUseInterface {
    void doAnything() {
        // Sentences
    }
}

public class QuadrangleUseInterface {
    void doAnything() {
        // Sentences
    }

    public static void main(String[] args) {
        drawTest[] d = {                        // 接口也可以向上转型，即，认为子类的对象包含接口对象的实例
                new SquareUseInterface(),
                new ParallelogramUseInterface(),
                new drawTest() {
                    @Override
                    public void draw() {
                        System.out.println("fuck you");
                    }
                }
        };

        for (int i = 0; i < d.length; i++) {
            d[i].draw();
        }
        /**
         * output:
         * 正方形的draw
         * 平行四边形的draw
         * fuck you
         */
    }
}
