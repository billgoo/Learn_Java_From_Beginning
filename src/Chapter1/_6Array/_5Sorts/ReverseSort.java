package Chapter1._6Array._5Sorts;

public class ReverseSort {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        ReverseSort sorter = new ReverseSort();

        sorter.sort(array);
    }

    /**
     * 降序冒泡排序
     *
     * @param array
     * 要排序的数组
     */
    public void sort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }

        showArray(array);
    }

    /**
     * 显示数组中所有元素
     *
     * @param array
     * 要显示的数组
     */
    public void showArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
}
