package com.lhy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName test
 * @Description
 * @Author lihengyu
 * @Date 2021/3/10 20:03
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[][] arr1 = new int[q][2];
        for (int i = 0; i < q; i++) {
            arr1[i][0] = input.nextInt();
            arr1[i][1] = input.nextInt();
        }

        for (int i = 0; i < q; i++) {
            score(arr,arr1[i][0],arr1[i][1]);
        }

    }
    static void score(int[] arr,int left,int right){
        if (right-left<2){
            System.out.println("NoScore");
            return ;
        }
        int highIndex = findHigh(arr);
        int[] arr1 = remove(arr,highIndex);
        int lowIndex = findLow(arr1);
        int[] arr2 = remove(arr1,lowIndex);

        int sum=0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        System.out.println(sum/arr2.length);
    }
    static int findHigh(int[] arr){
        int highIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            highIndex = arr[i]>arr[highIndex] ? i : highIndex;
        }
        return highIndex;
    }
    static int findLow(int[] arr){
        int lowIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            lowIndex = arr[i]<lowIndex ? i : lowIndex;
        }
        return lowIndex;
    }
    static int[] remove(int [] arr,int index){
        int[] temp =  new int[arr.length-1];

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i];
        }

        return temp;
    }
}
