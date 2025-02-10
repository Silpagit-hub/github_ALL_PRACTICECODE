package com.javaCore;

public class Constructor {

	public static void main(String[] args) {
		
		A d= new D();
		d.showA();

	}

}


class A{

	public A() {
System.out.println("class A calling");	
    }
	
	public void showA() {System.out.println("A"); }
	
}

class B extends A{

	public B() {
		System.out.println("class B calling");	
     }
	public void showB()
{System.out.println("B");
		}
}

class D extends B{

	public D() {
		System.out.println("class D calling");	
	}
public void showD() {
	System.out.println("D");
}

	
	
	
	
}