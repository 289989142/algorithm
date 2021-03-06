package com.lhy.sort;

/**
 * @ClassName CoreMethod
 * @Description 公共方法
 * @Author lihengyu
 * @Date 2021/3/6 23:25
 * @Version 1.0
 */
public class CoreMethod {
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
