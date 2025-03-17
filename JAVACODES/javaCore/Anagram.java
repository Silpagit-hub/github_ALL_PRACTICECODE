package com.javaCore;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1="madam";
        String s2="daamm";
        String[] arr1=s1.split("");
        String[] arr2=s2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.toString(arr1).equals(Arrays.toString(arr2))){
            System.out.println(s1+ " This string is anagram");
        }
        else {
            System.out.println("this is not anagram");
        }

    }
}
