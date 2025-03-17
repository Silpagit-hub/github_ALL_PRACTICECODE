package com.javaCore;

import java.util.Arrays;

public class MultiplyArrayIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int result=1;
        for(int num:arr){
         result=result*num;
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=result/arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
