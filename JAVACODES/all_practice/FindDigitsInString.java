package com.all_practice;

public class FindDigitsInString {
    public static void main(String[] args) {
        String input = "silpa123";

        StringBuilder result=new StringBuilder();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(Character.isDigit(c)){
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
