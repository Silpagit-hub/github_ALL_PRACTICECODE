package com.javaCore;

import java.util.*;

public class FindOccurance {

    public static void main(String[] args) {

        String word = "banana";
        String[] arr = word.split("");
        List<String >list=new LinkedList<>();
        Set<String> set= new LinkedHashSet<>();
        Set<String> set1= new LinkedHashSet<>();

        for (int i=0;i< arr.length;i++){
            if (!set.add(arr[i])){
                set1.add(arr[i]);
               //list.add(arr[i]);
            }else{
               // list.remove(arr[i]);
                }
        }
        list.addAll(set1);
        System.out.println(list.get(0));

//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + count);
//            } else {
//                map.put(arr[i], count);
//            }
//        }
//        int count = 0;
//        for (Map.Entry<String, Integer> mm : map.entrySet()) {
//            if (mm.getValue() == 1) {
//                count++;
//                if (count == 2) { // Checking for the second occurrence
//                    System.out.println("Second non-repeating character: " + mm.getKey());
//                    break;
//                }
//            }
//        }


    }
}

