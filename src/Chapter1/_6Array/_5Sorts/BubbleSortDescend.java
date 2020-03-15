package Chapter1._6Array._5Sorts;

public class BubbleSortDescend {
    public static void main(String[] args) {
        int[] array = {63, 4, 24, 1, 3, 15};

        BubbleSortDescend sorter = new BubbleSortDescend();

        sorter.sort(array);
    }

    /**
     * 降序冒泡排序
     *
     * @param array
     * 要排序的数组
     */
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
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
