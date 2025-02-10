package com.java8Concept;

import java.util.Arrays;
import java.util.List;

public class CustomsortingEx {

	public static void main(String[] args) {

		List<Employee> list= Arrays.asList(new Employee("Silpa",123),new Employee("Varsha",1123),new Employee("Silpa",1223),new Employee("Xaviar",323));
		
		list.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).forEach(System.out::println);
		
		
		}

}
