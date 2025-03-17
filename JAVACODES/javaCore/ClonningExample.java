package com.javaCore;

public class ClonningExample {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address adr = new Address("Hyderabad", "homes");
		Employee emp = new Employee("Silpa", 1243, adr);
		Employee emp1 = (Employee) emp.clone();

		adr.setCity("Bengalure");

		System.out.println(emp);


		System.out.println(emp1);

	}

}

class Employee implements Cloneable {

	String eName;
	int eId;
	Address address;

	public Employee(String eName, int eId, Address address) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.address = address;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employe = (Employee) super.clone();
		employe.setAddress((Address) employe.getAddress().clone());

		return employe;
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eId=" + eId + ", address=" + address + "]";
	}

}

class Address implements Cloneable {

	String city;
	String buildingName;

	public Address(String city, String buildingName) {
		super();
		this.city = city;
		this.buildingName = buildingName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", buildingName=" + buildingName + "]";
	}

}