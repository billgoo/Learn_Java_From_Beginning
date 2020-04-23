package Chapter2._12Exception._5ThrowException;

public class Captor {
    static int quotient(int x, int y) throws MyException {
        if (y < 0) {
            throw new MyException("除数不能是负数");
        }
        return x / y;
    }

    public static void main(String[] args) {
        try {
            int result = quotient(3, -1);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("除数不为0");
        } catch (Exception e) {
            System.out.println("程序其他异常");
        }
        /**
         * output:
         * 除数不能是负数
         */
    }
}
