package com.java8Concept;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddKeyAndValue {
    public static void main(String[] args) {
        String word = "AABBBCB";

        StringBuilder result=new StringBuilder();
        int count = 1;

        for (int i=0;i<word.length();i++){
            if (i<word.length()-1 && word.charAt(i)==word.charAt(i+1)){
                count++;
            } else{
                result.append(word.charAt(i)).append(count);
                count = 1;}
        }
      System.out.println(result.toString());

    }
}