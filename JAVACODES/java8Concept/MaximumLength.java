package com.java8Concept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumLength {

    public static void main(String[] args) {
        String[] word={"Mango","Apples","Watermelon"};

        String result=Arrays.asList(word).stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        System.out.println(result+" and the length is "+result.length());

    }
}
