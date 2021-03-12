package com.lhy.sort;

import java.util.Arrays;

/**
 * @ClassName CountingSort
 * @Description 计数排序 适合范围小 数量大的
 * @Author lihengyu
 * @Date 2021/3/12 20:16
 * @Version 1.0
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1,2,1,0,3,6,5,4,2,1,3,2,4};
        sort(arr,0,6);
        CoreMethod.printArr(arr);
    }
    public static void sort(int[] arr,int rangeStart,int rangeEnd){
        int[] bucket =new int[rangeEnd-rangeStart+1];
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }
        for (int i = 1; i < bucket.length; i++) {
            bucket[i] = bucket[i] + bucket[i-1];
        }
        for (int i = arr.length-1; i >= 0 ; i--) {
            result[--bucket[arr[i]]] = arr[i];
        }
        System.arraycopy(result,0,arr,0,arr.length);
    }
}
