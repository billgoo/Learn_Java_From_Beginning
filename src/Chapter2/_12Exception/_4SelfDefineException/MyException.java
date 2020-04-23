package Chapter2._12Exception._4SelfDefineException;

public class MyException extends Exception {
    public MyException(String ErrorMessage) {
        super(ErrorMessage);
    }
}
