package com.lhy.sort;

/**
 * @ClassName SelectionSort
 * @Description 选择排序
 * @Author lihengyu
 * @Date 2021/3/5 15:36
 * @Version 1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {11,2,3,123,5};
        int[] sorted = SelectionSort.selection(arr);

        for (int value : sorted) {
            System.out.println(value);
        }
    }
    public static int[] selection(int[] arr){
        int length = arr.length;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (arr[j]<arr[temp]){
                    temp = j;
                }
            }
            if (temp != i){
                int swap = arr[temp];
                arr[temp] = arr[i];
                arr[i] = swap;
            }
        }

        return arr;
    }
}
