package com.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        String word = "ABYGAAB";
String[]arr=word.split("");
        Set<String> set = new LinkedHashSet<>();
        List<String> list = new LinkedList<>();
        Set<String> set1=new LinkedHashSet<>();

//        for (int i = 0; i < word.length(); i++) {
//          if (!set.add(arr[i])){
//              set1.add(arr[i]);// to find duplicate
//             // list.remove(arr[i]); to find non-repeated
//          } else{
//             // list.add(arr[i]);
//              }
//        }
//        System.out.println(set1);

     Map<String ,Long> map=Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    list=map.entrySet().stream().filter(m ->m.getValue()==1).map(i->i.getKey()).collect(Collectors.toList());

        System.out.println(list);
    }
}
