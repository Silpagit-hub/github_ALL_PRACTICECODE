package com.javaCore;

public class PrintNumberReaptedly {

    public static void main(String[] args) {
        String word="ABCD";
        for (int i=0;i<word.length();i++){
            for (int j=0;j<word.length();j++){
            System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
