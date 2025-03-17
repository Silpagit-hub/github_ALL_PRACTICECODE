package com.all_practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonDuplicate {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Silpa","Debasish","Subhasish","Silpa","Debasish","Java");

      Map<String,Long> map =names.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
      Map.Entry<String,Long> result=map.entrySet().stream().filter((k)-> k.getValue()==1).skip(0).findFirst().get();
        //System.out.println(result);

        System.out.println(map.entrySet().stream().filter((k)-> k.getValue()==1).skip(1).findFirst().get());
    }
}
