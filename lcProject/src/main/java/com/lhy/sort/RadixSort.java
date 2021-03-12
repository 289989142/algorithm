package com.lhy.sort;

import java.util.Arrays;

/**
 * @ClassName RedixSort
 * @Description 基数排序  n+k  wen
 * @Author lihengyu
 * @Date 2021/3/13 0:00
 * @Version 1.0
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {111,222,123,444,502,145,578,697,945};
        sort(arr);
        CoreMethod.printArr(arr);
    }
    public static void sort(int[] arr){
        int[] result = new int[arr.length];
        int[] bucket = new int[10];

        for (int i = 0; i < 3; i++) {
            int division = (int)Math.pow(10,i);
            for (int j = 0; j < arr.length; j++) {
                int num = arr[j] / division % 10;
                bucket[num]++;
            }

            for (int j = 1; j < bucket.length; j++) {
               bucket[j] = bucket[j] + bucket[j-1];
            }

            for (int j = arr.length - 1; j>=0 ; j--) {
               int num = arr[j] / division % 10;
               result[--bucket[num]]  = arr[j];
            }
            System.arraycopy(result,0,arr,0,arr.length);
            Arrays.fill(bucket,0);
        }

    }
}
