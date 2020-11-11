package com.lhy.sort;

import java.util.Arrays;

/**
 * 快排 非手撕
 * @author HASEE
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2323, 34, 6, 657, 111111};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int start, int end){
        int i = start;
        int j = end;
        int key = arr[start];

        while (i<j) {
            while (i < j && arr[j] > key){
                j--;
            }
            while (i < j && arr[i] < key){
                i++;
            }
            if (i < j && arr[i] == arr[j]){
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            //ij相等 是当前key的位置
            if (i > start +1) {
                sort(arr, start, i - 1);
            }
            if (i < end -1) {
                sort(arr, i + 1, end);
            }
        }
    }
}
