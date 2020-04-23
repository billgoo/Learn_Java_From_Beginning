package Chapter2._12Exception._5ThrowException;

public class MyException extends Exception {
    String message;
    public MyException(String ErrorMessage) {
        message = ErrorMessage;
    }
    public String getMessage() {
        return message;
    }
}
