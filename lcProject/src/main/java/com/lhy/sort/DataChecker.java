package com.lhy.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName DataChecker
 * @Description 对数器
 * @Author lihengyu
 * @Date 2021/3/5 16:22
 * @Version 1.0
 */
public class DataChecker {
    static int[] generateRandomArray(){
        Random r = new Random();

        int[] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        return arr;
    }

    static void check(){
        int[] arr = generateRandomArray();
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr,0,arrCopy,0,arr.length);

        Arrays.sort(arr);
        InsertionSort.sort1(arrCopy);

        boolean same = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arrCopy[i]) {
                same = false;
                break;
            }
        }

        System.out.println(same ? "right" : "wrong");
    }

    public static void main(String[] args) {
        check();
    }
}
