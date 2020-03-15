package Chapter1._6Array._7Practice;

public class Test4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Test4 test4 = new Test4();
        test4.showArray(array);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        test4.showArray(array);
    }

    public void showArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j]);
                if (j != array.length - 1) System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
