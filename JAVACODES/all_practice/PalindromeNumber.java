package com.all_practice;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;
        int remd;
        int temp = 0;

        while (num > 0) {
            remd = num %10;
            temp = (temp * 10) + remd;
            num = num/10;
        }
        if (originalNum == temp) {
            System.out.println("num is palindrom");
        }
        else{
            System.out.println("num is not palindrom");
        }
    }
}