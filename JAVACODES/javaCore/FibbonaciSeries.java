package com.javaCore;

public class FibbonaciSeries {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int temp=0;
        for(int i=2;i<=10;i++){
            temp=x+y;//0+1
            x=y;
            y=temp;
        }
        System.out.println(temp);
    }
}
