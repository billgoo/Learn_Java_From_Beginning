package Chapter1._6Array._5Sorts;

public class SelectSortDescend {
    public static void main(String[] args) {
        int[] array = {63, 4, 24, 1, 3, 15};

        SelectSortDescend sorter = new SelectSortDescend();

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
            int index = 0;
            for (int j = 1; j <= array.length - i; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int temp = array[array.length - i];
            array[array.length - i] = array[index];
            array[index] = temp;
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
