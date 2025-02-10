package com.java8Concept;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapOccurance {

	public static void main(String[] args) {
String name= "Silpa banana banana Silpa xyz";

String[] arr= name.split(" ");

Map<String,Long> map =Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

System.out.println(map);

Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
.forEach((key,value)-> System.out.println(key+" : "+value));

	}

}
