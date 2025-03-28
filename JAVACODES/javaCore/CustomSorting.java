package com.javaCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CustomSorting {

	public static void main(String[] args) {

		List<Students> list= new ArrayList<Students>();
		list.add(new Students(12,"Silpa"));
		list.add(new Students(14,"Akash"));
		list.add(new Students(15,"Xaviar"));
		list.add(new Students(19,"Aankita"));
		list.add(new Students(17,"Aankita"));

		
		Collections.sort(list,new NameComparator());
				
		for(Students s : list) {
			System.out.println(s);
		}

	}

}

class Students{
	int id;
	String name;
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	
	
	
}


class NameComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
	 if(o1.getName().compareTo(o2.getName()) == 0) {
		 return o1.getId() - o2.getId();
	 }
		 return o1.getName().compareTo(o2.getName());
		}
}