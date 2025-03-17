package com.all_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(11);
        list.add(9);
        list.add(5);

       List<Integer> result= list.stream().filter(i->i%2==0).collect(Collectors.toList());
       if(result.isEmpty()){
           System.out.println(0);
       }
       else {
           result.forEach(System.out::println);
       }
    }
}
