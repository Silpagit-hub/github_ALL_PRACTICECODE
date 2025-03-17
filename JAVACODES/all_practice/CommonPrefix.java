package com.all_practice;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] names={"sit","silpa","sila","silk"};
        String temp=names[0];
        for (int i=1;i<names.length;i++){
            while (!names[i].startsWith(temp)){
               temp=temp.substring(0,temp.length()-1);
            }
        }
        System.out.println(temp+" is the most used prifix");
    }
}
