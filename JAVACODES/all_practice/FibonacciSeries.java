package com.all_practice;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int result=0;
        for(int i=1;i<=5;i++){
            result=num1+num2;//0+1=1
            num1=num2;//num2+result
            num2=result;
        }
        System.out.println(result+" is the factorial of 5");
    }
}
