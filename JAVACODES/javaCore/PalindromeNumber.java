package com.javaCore;

public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 123;
        int sum = 0;

        while (num > 0) {
            int remain = num % 10;
          sum = sum + remain;
            //if I need to reverse the number
            //sum=sum*10+remain;
            num = num / 10;
        }

        System.out.println("Sum of digits: " + sum); // Should print 6 (1+2+3)
    }
}