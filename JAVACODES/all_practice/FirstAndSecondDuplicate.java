package com.all_practice;

import java.util.*;
import java.util.stream.Collectors;

public class FirstAndSecondDuplicate {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Silpa","Debasish","Subhasish","Silpa","Debasish");

        Set<String> set=new LinkedHashSet<>();
       List<String> result= names.stream().filter(list->!set.add(list)).collect(Collectors.toList());
        System.out.println(result.get(1));
        System.out.println(result.get(0));

    }
}
