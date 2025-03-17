package com.all_practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorting {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 15);
        map.put("Orange", 8);
        map.put("Grapes", 20);
        map.put("Mango", 5);

       //map.entrySet().stream().sorted((o1,o2)->o1.getKey().compareTo(o2.getKey())).forEach(System.out::println);

//        Map<String,Integer> result=map.entrySet().stream().sorted((o1,o2)->o2.getKey().compareTo(o1.getKey())).collect(Collectors.toMap
//               (k->k.getKey(),v->v.getValue(),(e1,e2)->e1,LinkedHashMap::new));


        Map<String,Integer> result=map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.
                toMap(k->k.getKey(),
                        v->v.getValue(),
                        (e,r)->e,
                        LinkedHashMap::new));


        System.out.println(result);

    }
}
