package com.java8Concept;

public class EmployeeData {
	String name;
	int id;
	double salary;
	String dept;
	public EmployeeData(String name, int id, double salary, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", id=" + id + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	

}
