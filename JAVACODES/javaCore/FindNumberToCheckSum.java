package com.javaCore;

import java.util.HashSet;
import java.util.Set;

public class FindNumberToCheckSum {
    public static void main(String[] args) {

        int[]arr={5,1,2,3,3,7,6};
        Set<Integer>set=new HashSet<>();

        for (int i=0;i< arr.length;i++){
            int add=8-arr[i];
            if(set.contains(add)){
                System.out.println("Find pair : "+arr[i]+"+"+add);
                set.remove(add);
            }
            set.add(arr[i]);
        }
    }
}
