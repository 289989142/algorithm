package com.lhy.sort;

/**
 * @ClassName MergeSort  适合区间有序的
 * @Description 归并排序 nlogn n 稳  (对于对象的排序都是归并 因为快速稳定)
 * @Author lihengyu
 * @Date 2021/3/9 23:28
 * @Version 1.0
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,3,6,9,11,11,123,124124,356};
        sort(arr,0,arr.length-1);
        CoreMethod.printArr(arr);
    }
    public static void sort(int[] arr,int left,int right){
        if (left == right) {
            return ;
        }
        //分成两半
        int mid = left + (right-left)/2;
        //左边排序
        sort(arr,left,mid);
        //右边排序
        sort(arr,mid+1,right);
        //归并
        merge(arr,left,mid+1,right);
    }
    private static void merge(int[] arr,int leftPrt,int rightPrt,int rightBound){
        int[] temp = new int[rightBound-leftPrt+1];
        int i=leftPrt;
        int j=rightPrt;
        int k=0;
        while (i<=rightPrt-1 && j<=rightBound){
            temp[k++] = arr[i]<=arr[j] ? arr[i++] : arr[j++];
        }
        while(i<=rightPrt-1) {
            temp[k++] = arr[i++];
        }
        while (j<=rightBound){
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[leftPrt+l] = temp[l];
        }
    }
}
