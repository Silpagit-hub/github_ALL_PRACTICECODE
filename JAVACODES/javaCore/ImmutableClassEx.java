package com.javaCore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ImmutableClassEx {

	public static void main(String[] args) throws CloneNotSupportedException {

		Teacher t = new Teacher("madam", "5th");
		Date d = new Date(29);
		List list= new ArrayList<String>();
		list.add("duster");
		list.add("chalk");
		Student student = new Student("Silpa", 4431, t, d,list);
		list.add("table");
		t.setTeacherName("Sir");
		d.setDate(30);
		System.out.println(student);
	}

}

final class Student {

	private final String name;
	private final int rollNo;
	private final Teacher teaher;
	private final Date date;
	private final List<String> items;

	public Student(String name, int rollNo, Teacher teaher, Date date, List<String> items) throws CloneNotSupportedException {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.teaher = (Teacher) teaher.clone();
		this.date = date;
		this.items= new ArrayList<String>(items);
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public Teacher getTeaher() throws CloneNotSupportedException {
		return (Teacher)teaher.clone();
		
	}

	public Date getDate() {
		return new Date(date.getTime());

	}
	
	public List<String> getItems() {
		return Collections.unmodifiableList(items);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", teaher=" + teaher + ", date=" + date + ", items="
				+ items + "]";
	}

	
}

class Teacher implements Cloneable {

	String teacherName;
	String standard;

	public Teacher(String teacherName, String standard) {
		super();
		this.teacherName = teacherName;
		this.standard = standard;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Teacher)super.clone();
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", standard=" + standard + "]";
	}

}