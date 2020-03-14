package Chapter1._5String._7StringBuilder;

public class Jerque {
    public static void main(String[] args) {
        String str = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);    // 90 ms

        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);    // 1 ms
        System.out.println(builder.toString());
    }
}
