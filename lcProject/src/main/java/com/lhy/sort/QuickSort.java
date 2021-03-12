package com.lhy.sort;

import java.util.Arrays;

/**
 * 快排  适合对稳定性没有要求的
 * @author HASEE
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,10,3,2,8,1,9,5,4,6,6,6};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int start, int end){
        if (start>=end){
            return;
        }

        int key = partition(arr,start,end);
        sort(arr,start,key-1);
        sort(arr,key+1,end);
    }
    static int partition(int[] arr, int start, int end){
        int key = end;
        int left = start;
        int right = end-1;
        while (left<=right){
            while (arr[left] <= arr[key] && left<=right){
                left++;
            }
            while (arr[right] > arr[key] && left<=right){
                right--;
            }
            if (left<right){
                CoreMethod.swap(arr,left,right);
            }
        }
        CoreMethod.swap(arr,key,left);
        return left;
    }
}
