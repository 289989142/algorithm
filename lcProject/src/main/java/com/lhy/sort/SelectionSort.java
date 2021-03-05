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
            System.out.print(value+" ");
        }
    }
    public static int[] selection(int[] arr){
        int length = arr.length;
        int minPos = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (arr[j]<arr[minPos]){
                    minPos = j;
                }
            }
            if (minPos != i){
                int swap = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = swap;
            }
        }

        return arr;
    }
}
