package Chapter2._12Exception._4SelfDefineException;

public class Tran {
    static int avg(int n1, int n2) throws MyException {
        if (n1 < 0 || n2 < 0) {
            throw new MyException("不可以用负数");
        }
        if (n1 > 100 || n2 > 100) {
            throw new MyException("数值太大了");
        }
        return (n1 + n2) / 2;
    }

    public static void main(String[] args) {
        try {
            int result = avg(102, 150);
            System.out.println(result);
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
