package Chapter2._12Exception._9Practice.Test1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            s1.speak(100);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            s1.speak(1001);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        /**
         * output:
         * m = 100
         * m大于1000
         * Chapter2._12Exception._9Practice.Test1.MyException: m大于1000
         * 	at Chapter2._12Exception._9Practice.Test1.Student.speak(Student.java:6)
         * 	at Chapter2._12Exception._9Practice.Test1.Main.main(Main.java:14)
         */
    }
}
