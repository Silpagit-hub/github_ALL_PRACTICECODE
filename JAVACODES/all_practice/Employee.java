package com.all_practice;

import java.time.LocalDate;

public class Employee {

    private String name;
    private double salary;
    private String employeeId;
    private String department;
    private int age;
    private LocalDate joiningDate;
    private String position;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", employeeId='" + employeeId + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", joiningDate=" + joiningDate +
                ", position='" + position + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String name, double salary, String employeeId, String department, int age, LocalDate joiningDate, String position) {
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
        this.department = department;
        this.age = age;
        this.joiningDate = joiningDate;
        this.position = position;


    }
}
