package com.lhy.sort;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序 n2 1 稳
 * @Author lihengyu
 * @Date 2021/3/6 23:21
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,5412,1231,13432,123123123,5,6,9};
        sort(arr);
        CoreMethod.printArr(arr);
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    CoreMethod.swap(arr,j,j+1);
                }
            }
        }
    }
}
