package com.javaCore;


public class StringReverse {

	public static void main(String[] args) {
 String name="silpa";
 String temp=" ";

 for (int i=name.length()-1;i>=0;i-- ) {
	temp= temp+name.charAt(i);
}
	System.out.println("The reversed String is : " + temp);

	}

}
