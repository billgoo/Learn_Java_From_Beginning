package Chapter2._12Exception._9Practice.Test1;

public class Student {
    public void speak(int m) throws MyException {
        if (m > 1000) {
            throw new MyException("m大于1000");
        }
        // do something
        System.out.println("m = " + m);
    }
}
