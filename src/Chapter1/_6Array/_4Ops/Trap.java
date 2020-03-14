package Chapter1._6Array._4Ops;

public class Trap {
    public static void main(String[] args) {
        int[][] b = new int[3][];
        for (int i = 0; i < 3; i++) {
            b[i] = new int[i + 1];
        }

        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                b[i][j] = count++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
