package com.all_practice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompareNameThenId {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 5000, "E101", "HR", 28, LocalDate.of(2015, 1, 10), "Manager"),
                new Employee("Jane", 7500, "E102", "IT", 32, LocalDate.of(2016, 3, 15), "Developer"),
                new Employee("Tom", 6200, "E103", "Finance", 40, LocalDate.of(2012, 7, 12), "Analyst"),
                new Employee("Alice", 8800, "E104", "Marketing", 26, LocalDate.of(2018, 9, 20), "Director"),
                new Employee("Bob", 7100, "E105", "Sales", 35, LocalDate.of(2014, 5, 25), "Sales Manager"),
                new Employee("Mike", 6000, "E106", "HR", 30, LocalDate.of(2017, 2, 18), "HR Executive"),
                new Employee("Sara", 8200, "E107", "IT", 27, LocalDate.of(2019, 7, 22), "Software Engineer"),
                new Employee("Liam", 7000, "E108", "Sales", 34, LocalDate.of(2015, 11, 10), "Sales Executive"),
                new Employee("Sophia", 9800, "E109", "Marketing", 29, LocalDate.of(2020, 5, 12), "Marketing Manager"),
                new Employee("David", 7600, "E110", "Finance", 38, LocalDate.of(2013, 8, 30), "Finance Manager")
        );

        List<Employee> result=employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getEmployeeId)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
