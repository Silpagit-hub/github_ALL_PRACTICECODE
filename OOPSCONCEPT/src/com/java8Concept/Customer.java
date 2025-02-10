package com.java8Concept;

import java.util.List;

public class Customer {
	private String name;
	private String e_mailId;
	private List<String> phoneNumbers;
	
	
	public Customer(String name, String e_mailId, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.e_mailId = e_mailId;
		this.phoneNumbers = phoneNumbers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getE_mailId() {
		return e_mailId;
	}
	public void setE_mailId(String e_mailId) {
		this.e_mailId = e_mailId;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	
	

}
