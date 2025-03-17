package com.all_practice;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListConcatenation {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        List<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("D");

        List<String> concatenatedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());

        System.out.println(concatenatedList);
    }
}
