package com.all_practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class EmployeeExperience {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 5000, "E101", "HR", 28, LocalDate.of(2015, 1, 10), "Manager"),
                new Employee("Jane", 7500, "E102", "IT", 32, LocalDate.of(2016, 3, 15), "Developer"),
                new Employee("Tom", 6200, "E103", "Finance", 40, LocalDate.of(2012, 7, 12), "Analyst"),
                new Employee("Alice", 8800, "E104", "Marketing", 26, LocalDate.of(2018, 9, 20), "Director"),
                new Employee("Bob", 7100, "E105", "Sales", 35, LocalDate.of(2014, 5, 25), "Sales Manager")
        );

        LocalDate currentDate= LocalDate.now();

        for (Employee employee : employees) {
            Period duration = Period.between(employee.getJoiningDate(), currentDate);
            long totalDays = ChronoUnit.DAYS.between(employee.getJoiningDate(), currentDate);
            long totalMonths= ChronoUnit.MONTHS.between(employee.getJoiningDate(), currentDate);
            long totalWeek= ChronoUnit.WEEKS.between(employee.getJoiningDate(), currentDate);
            long totalYear=ChronoUnit.YEARS.between(employee.getJoiningDate(), currentDate);
            long totalHours = totalDays * 24;
            long totalMinutes = totalHours * 60;

         //   System.out.println("Experience of " + employee.getEmp_Name() + " in the company:");
            System.out.println("------------------------------------------------------");
            System.out.println("Years: " + duration.getYears());
            System.out.println("Months: " + duration.getMonths());
            System.out.println("Days: " + duration.getDays());
            System.out.println("Total Weeks: " + totalWeek);
            System.out.println("Total Months: " + totalMonths);
            System.out.println("Total Years: " + totalYear);
            System.out.println("Total Days: " + totalDays);
            System.out.println("Total Hours: " + totalHours);
            System.out.println("Total Minutes: " + totalMinutes);
            System.out.println("------------------------------------------------------");

        }
    }
}
