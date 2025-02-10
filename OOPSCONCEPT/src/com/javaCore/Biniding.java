package com.javaCore;

public class Biniding {

	public static void main(String[] args) {

		Bind1 b = new Bind2();
		Bind1.bind1();
		b.overide();
	}

}


class Bind1{
	public static void bind1() {
		System.out.println("Binding1");
	}
	
	public void overide() {
		System.out.println("Override parent");
	}
}

class Bind2 extends Bind1{
	
public static void bind1() {
	System.out.println("Binding2");
}

public void overide() {
	System.out.println("Override child");
}
}