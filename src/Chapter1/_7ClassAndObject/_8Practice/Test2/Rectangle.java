package Chapter1._7ClassAndObject._8Practice.Test2;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calArea() {
        return this.length * this.width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(8, 13);
        System.out.println(r.calArea());
    }
}
