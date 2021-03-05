package com.lhy.sort;

/**
 * @ClassName SelectionSort
 * @Description 选择排序 时间O(n2)  空间O(1)  不稳定
 * @Author lihengyu
 * @Date 2021/3/5 15:36
 * @Version 1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {11,2,3,123,5,5,1,3,5};
        SelectionSort.sort(arr);
        printArr(arr);
    }
    public static int[] sort(int[] arr){
        int length = arr.length;
        int minPos = 0;

        for (int i = 0; i < length; i++) {
            minPos = i;

            for (int j = i; j < length; j++) {
                minPos = arr[j]<=arr[minPos] ? j : minPos;
            }

            swap(arr,minPos,i);
        }

        return arr;
    }

    public static void printArr(int[] arr){
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }

    public static void swap(int[] arr,int pos1,int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
