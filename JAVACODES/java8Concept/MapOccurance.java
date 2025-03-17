package com.java8Concept;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapOccurance {

	public static void main(String[] args) {
String name= "Silpa banana banana Silpa xyz";

String[] arr= name.split(" ");

Map<String, Long> mapresult =
		Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));


		String result = String.valueOf(mapresult.entrySet().stream().filter(k ->k.getValue() ==1).map((Map.Entry::getKey))
				.map(s -> s.charAt(0))
				.findFirst());


	}

}
