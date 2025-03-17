package com.all_practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeFilterByJoiningData {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 5000, "E101", "HR", 28, LocalDate.of(2015, 1, 10), "Manager"),
                new Employee("Jane", 7500, "E102", "IT", 32, LocalDate.of(2016, 3, 15), "Developer"),
                new Employee("Tom", 6200, "E103", "Finance", 40, LocalDate.of(2012, 7, 12), "Analyst"),
                new Employee("Alice", 8800, "E104", "Marketing", 26, LocalDate.of(2018, 9, 20), "Director"),
                new Employee("Bob", 7100, "E105", "Sales", 35, LocalDate.of(2014, 5, 25), "Sales Manager")
        );

        LocalDate startdate= LocalDate.of(2014,1,1);
        LocalDate endDate=LocalDate.of(2016,12,30);

  List<Employee> result= employees.stream().filter(e->
   e.getJoiningDate().isAfter(startdate)&&
               e.getJoiningDate().isBefore(endDate)).collect(Collectors.toList());

  result.forEach(System.out::println);
    }

}
