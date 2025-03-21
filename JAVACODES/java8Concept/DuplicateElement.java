package com.java8Concept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {

		String name = "Silpa banana banana Silpa xyz";
		String[]arr=name.split(" ");
		
		Set<String> set = new HashSet<>();
		
		//first Duplicate
     List<String> duplicate = Arrays.asList(arr).stream()
              .filter(word -> !set.add(word))  
              .collect(Collectors.toList());
     
	duplicate.stream().forEach(System.out::println);	
     
	
     System.out.println(duplicate.get(0));

       System.out.println( duplicate.get(1));
	}

}
