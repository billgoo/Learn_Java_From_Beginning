package Chapter1._6Array._4Ops;

import java.util.Arrays;

public class Cope {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 42, 12, 2};
        int[] newarr1 = Arrays.copyOf(arr, 6);
        int[] newarr2 = Arrays.copyOf(arr, 2);
        int[] newarr3 = Arrays.copyOfRange(arr, 0, 3);

        for (int i = 0; i < newarr1.length; i++) {
            System.out.print(newarr1[i] + ",");
        }
        System.out.println();

        for (int i = 0; i < newarr2.length; i++) {
            System.out.print(newarr2[i] + ",");
        }
        System.out.println();

        for (int i = 0; i < newarr3.length; i++) {
            System.out.print(newarr3[i] + ",");
        }
    }
}
