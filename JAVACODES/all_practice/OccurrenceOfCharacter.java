package com.all_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        String names="madam";
        String[] arr=names.split("");

        Map<String,Long> map =Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
