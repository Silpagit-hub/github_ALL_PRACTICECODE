package com.test;

public class PrintCountOfString {

    public static void main(String[] args) {
        String word="AABRRRVV";

        StringBuilder result= new StringBuilder();
        int count=1;
        for (int i=0;i<word.length();i++){
            if (i<word.length()-1 && word.charAt(i) == word.charAt(i+1)){
                count++;
            }
            else {
                result=result.append(word.charAt(i)).append(count);
                count=1;
            }
        }
        System.out.println(result.toString());
    }

}
