package Chapter1._6Array._4Ops;

import java.util.Arrays;

public class Reference {
    public static void main(String[] args) {
        int[] ia = new int[]{1, 8, 9, 4, 5};

        /*
        * binarySearch(Object[] a, Object, key)
        * 二分搜索在数组中搜索key，如果找到返回索引，否则返回-1或
        * -(key元素可能的插入点，即第一个大于此键的元素索引 + 1，即第几个元素)
        * 使用搜索之前需要先对数组进行sort，未排序则结果不确定，
        * 且含多个相同元素可能不确定找到哪一个
        * */
        Arrays.sort(ia);
        System.out.println(Arrays.binarySearch(ia, 4)); // 1
        System.out.println(Arrays.binarySearch(ia, 7)); // -4
        System.out.println(Arrays.binarySearch(ia, 2)); // -2
    }
}
