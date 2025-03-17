package com.all_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int []arr={4,1,5,9,2,3};

        LinkedList<Integer> result=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedList::new));

        System.out.println("Second highest number is "+result.get(1));
    }
}
