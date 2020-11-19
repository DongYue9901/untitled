package com.dongyue.test;

public class MaoPaoPaiXv {

    public static void main(String[] args) throws Exception {
        //初始化数组
        int[] arr = {6,5,4,3,2,1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int num:arr){
            System.out.println(num);
        }
    }
}