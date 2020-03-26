package Chapter2._10InterfaceInheritPolym._6Polymorphism;

public class Quadrangle {
    private Quadrangle[] qtest = new Quadrangle[6];
    private int nextIndex = 0;

    public void draw(Quadrangle q) {
        if (nextIndex < qtest.length) {
            qtest[nextIndex] = q;
            System.out.println(nextIndex++);
        }
    }

    public static void main(String[] args) {
        Quadrangle q = new Quadrangle();
        q.draw(new Square());
        q.draw(new Parallelogram());
    }
}

class Square extends Quadrangle {
    public Square() {
        System.out.println("正方形");
    }
}

class Parallelogram extends Quadrangle {
    public Parallelogram() {
        System.out.println("平行四边形");
    }
}
