package com.java8Concept;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstCharacter {

    public static void main(String[] args) {

        List<String> fruit=List.of("Apple","Mango","Banana","Avocado");

        Map<Character,String> map  =fruit.stream().collect(Collectors.toMap(
                fruits ->fruits.charAt(0),fruits->fruits,
                (exist,replacement)->replacement));
       // System.out.println(map);

        Map<Character,List<String>>map2=fruit.stream().collect(Collectors.groupingBy(f->f.charAt(0),Collectors.mapping(v->v,Collectors.toList())));
    System.out.println(map2);
    }
}
