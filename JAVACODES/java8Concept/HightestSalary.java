package com.java8Concept;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HightestSalary {

	public static void main(String[] args) {
		List<EmployeeData> list = List.of(new EmployeeData("Silpa", 101, 100000, "Software"),
				new EmployeeData("Debasish", 102, 110000, "Software"), new EmployeeData("Sunil", 106, 150000, "Admin"),
				new EmployeeData("Varsha", 104, 170000, "Software"), new EmployeeData("Shilpa", 109, 120000, "Admin"));

		Map<String, List<Double>> map = list.stream().collect(Collectors.groupingBy(EmployeeData::getDept,
				Collectors.mapping(EmployeeData::getSalary, Collectors.toList())));

		map.forEach((x, y) -> {
			double salary = y.stream().sorted(Comparator.reverseOrder()).findFirst().get();
			double secondSalary = y.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1);
			double avarage = y.stream().mapToDouble(i -> i).average().getAsDouble();

			System.out.println("First hightest salary " + x + " " + salary);

			System.out.println("Second hightest " + x + " " + secondSalary);

			System.out.println(x+ " Avarage " + avarage);

		});
		
		double sum =list.stream().map(EmployeeData::getSalary).mapToDouble(i->i).sum();
		System.out.println(sum);

	}
}
