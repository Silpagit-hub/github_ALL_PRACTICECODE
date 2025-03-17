package com.java8Concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEven {

	public static void main(String[] args) {

		int[] arr= {5,2,4,7,8};
		
	   List<Integer> number= Arrays.stream(arr).boxed().filter(num-> num%2 != 0).map(i->i*3).collect(Collectors.toList());
		System.out.println("==================");
		
		System.out.println(number);
		Arrays.stream(arr).filter(num-> num%2 != 0).forEach(System.out::println);
		
		

	}

}
