package com.all_practice;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String name="silpa";
        String temp="saipl";
        String[] arr1=name.split("");
        String[] arr2=temp.split("");

        char[] xx=name.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.toString(arr1).equals(Arrays.toString(arr2))){
            System.out.println(name+" is anagram string");
        }
    }
}
