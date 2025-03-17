package com.javaCore;

public class InterfaceEx {
	
	public static void main(String[] args) {
		Car car= new Car();
		car.start();
		car.speedLimit();
	}

}

interface Vehichel{
	void start();
	
	default void speedLimit() {
		System.out.println("200");
	}
	
	static void key() {
		System.out.println("Start with key");
	}
}

class Car implements Vehichel{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speedLimit() {
		System.out.println("300");
	}
	
	
	
	
	
}