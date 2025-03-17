package com.all_practice;

public class StringPalindrome {
    public static void main(String[] args) {
        String name="mango";
        String result="";
        String[] arr=name.split("");
        for(int i=0;i<arr.length;i++){
            result=arr[i]+result;//""+m,m+a,
        }        if(name.equals(result)){
            System.out.println(name+" is palindrome");
        }
        else{
            System.out.println(result+" is not palindrome");
        }
    }
}
