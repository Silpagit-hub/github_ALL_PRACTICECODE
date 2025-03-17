package com.javaCore;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
 int[] number= {7,9,2,5,1,5};
  
 for(int i=0;i<number.length;i++) {
	 int temp=0;
	 for(int j=i+1;j<number.length;j++) {
		 if(number[j]< number[i]) {
			 temp=number[i];
			 number[i]=number[j];
			 number[j]=temp;
		 }
		 
	 }
	 
 }
 System.out.println("largest number is "+number[number.length-1]);
 System.out.println(Arrays.toString(number));

	}
}
