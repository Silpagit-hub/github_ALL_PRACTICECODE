package com.java8Concept;

import java.util.Comparator;
import java.util.List;

public class SortNameAndDeptTogether {
    public static void main(String[] args) {

        List<EmployeeData> list = List.of(new EmployeeData("Silpa", 101, 1300000, "software"),
                new EmployeeData("Dev", 102, 1000000, "software"),
                new EmployeeData("Miku", 103, 1500000, "UI"),
                new EmployeeData("silpa", 104, 1100000, "UI"));
         list.stream().sorted(Comparator.comparing(EmployeeData::getName).thenComparing(EmployeeData::getDept)
                 .thenComparing(EmployeeData::getSalary)).forEach(System.out::println);
    }
}
