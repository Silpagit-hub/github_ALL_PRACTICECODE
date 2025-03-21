package com.java8Concept;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomeSorting {

	public static void main(String[] args) {
		List<EmployeeData> list = List.of(new EmployeeData("Silpa", 101, 1300000, "software"),
				new EmployeeData("Dev", 102, 1000000, "software"), new EmployeeData("Miku", 103, 1500000, "UI"),
				new EmployeeData("silpa", 104, 1100000, "UI"));

		List<EmployeeData> allSalary =list.stream().sorted(Comparator.comparing(EmployeeData::getSalary).reversed()).collect(Collectors.toList());

		EmployeeData d = list.stream().sorted(Comparator.comparing(EmployeeData::getSalary).reversed()).findFirst()
				.get();

		System.out.println("Highest salary is :" + d);

		
	Map<String,List<Double>> map=list.stream().collect(Collectors.groupingBy(EmployeeData:: getDept,
				Collectors.mapping(EmployeeData::getSalary,Collectors.toList())));
	
	map.forEach((dept,salary)->{
	double dt =salary.stream().sorted(Comparator.reverseOrder()).findFirst().get();
	double salAvg=salary.stream().mapToDouble(y->y).average().getAsDouble();
	System.out.println(dept+ "  "+dt);
	});
	
	}

}
