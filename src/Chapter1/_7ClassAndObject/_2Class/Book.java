package Chapter1._7ClassAndObject._2Class;

public class Book {
    private String name;    // 成员变量

    public String getName() {
        int id = 0;
        setName("Java");
        return id + this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return this;    // 返回Book类对象的引用
    }
}
