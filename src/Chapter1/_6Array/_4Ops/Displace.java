package Chapter1._6Array._4Ops;

import java.util.Arrays;

public class Displace {
    public static void main(String[] args) {
        int[] arr = new int[]{45, 12, 2, 10};
        Arrays.fill(arr, 1, 2, 8);
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
}
