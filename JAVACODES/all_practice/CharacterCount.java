package com.all_practice;

public class CharacterCount {
    public static void main(String[] args) {
        String name="AABBSACB";
        StringBuilder result=new StringBuilder();
        int count=1;
        for (int i=0;i<name.length();i++){
            if(i <name.length()-1 && name.charAt(i)==name.charAt(i+1)){
              count++;
            }
            else{
               result.append(name.charAt(i)).append(count);
               count=1;
            }
        }
        System.out.println(result);
    }
}
