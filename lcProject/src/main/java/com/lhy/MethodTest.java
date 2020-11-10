package com.lhy;

public class MethodTest {
    public static void main(String[] args) {
        int[][] arr= new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        /*0 1 2

        * 1,2,3     0
        * 4,5,6     1
        * */
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(arr[0][i]);
        }
    }
}
