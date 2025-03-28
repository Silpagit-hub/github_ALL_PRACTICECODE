package com.javaCore;

public class SingletonEx {

	public static void main(String[] args) {
		SingleTon s1= SingleTon.getInstance();
		SingleTon s2=SingleTon.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		

	}

}

class SingleTon {
	private static SingleTon singleton;

	private SingleTon() {
	}

	public static SingleTon getInstance() {
		if (singleton == null) {
			synchronized (SingleTon.class) {
				if (singleton == null) {
					singleton= new SingleTon();

				}
			}
		}
		return singleton;

	}
}