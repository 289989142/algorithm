package com.lhy.sort;

/**
 * @ClassName ShellSort
 * @Description 希尔排序 n1.3  1  不稳
 * @Author lihengyu
 * @Date 2021/3/7 0:18
 * @Version 1.0
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {1,2,5412,1231,13432,123123123,5,6,9};
        sort(arr);
        CoreMethod.printArr(arr);
    }

    public static void sort(int[] arr){
        //knuth序列作为间隔
        int gap = 1;
        while (gap <= arr.length/3 ){
            gap=gap*3+1;
        }

        for (int h = gap ; h >0 ; h=(h-1)/3 ) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j > h-1 ; j-=h) {
                    if (arr[j]<arr[j-h]){
                        CoreMethod.swap(arr,j,j-h);
                    }
                }
            }
        }
    }
}
