package com.all_practice;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=5;
        boolean count=true;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                count=false;
                break;
            }
        }
        if (count){
            System.out.println(num+" is prime");
        }
        else {
            System.out.println(num+" is not prime number");
        }
    }
}
