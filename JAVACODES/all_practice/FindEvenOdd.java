package com.all_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenOdd {
    public static void main(String[] args) {
        int[]arr={6,3,9,7,4};
        List<Integer> even =Arrays.stream(arr).filter(i->i % 2 == 0).boxed().collect(Collectors.toList());
        List<Integer> odd= Arrays.stream(arr).boxed().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println("These are the even numbers : "+even);
        System.out.println("These are the odd numbers : "+odd);

    }
}
