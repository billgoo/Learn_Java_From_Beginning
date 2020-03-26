package Chapter2._10InterfaceInheritPolym._2Object;

public class ObjectInstance {
    public String toString() {
        return "在" + getClass().getName() + "类中重写toString()方法";
    }

    public static void main(String[] args) {
        System.out.println(new ObjectInstance());
        /**
         * output:
         * 在Chapter2._10InterfaceInheritPolym._2Object.ObjectInstance类中重写toString()方法
         * 打印类时自动调用toString()
         */
    }
}
