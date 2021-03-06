package com.lhy.sort;

/**
 * @ClassName InsertionSort
 * @Description 插入排序 和冒泡一样 n2 1 稳
 * @Author lihengyu
 * @Date 2021/3/6 23:37
 * @Version 1.0
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,5412,1231,13432,123123123,5,6,9};
        sort1(arr);
        CoreMethod.printArr(arr);
    }
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j]<arr[j-1]){
                    CoreMethod.swap(arr,j,j-1);
                }
            }
        }
    }
    /**
    * @Description //TODO 优化插入排序 不进行一个个swap 而是对比后直接往后移 然后找到不小于的位置插入
    * @Param [arr]
    * @return void
    **/
    public static void sort1(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int insertPos=0;
            for (int j = i; j > 0 ; j--) {
                if (temp <arr[j-1]){
                    arr[j] = arr[j-1];
                }else {
                    insertPos = j;
                    break;
                }
            }
            arr[insertPos] = temp;
        }
    }
}
