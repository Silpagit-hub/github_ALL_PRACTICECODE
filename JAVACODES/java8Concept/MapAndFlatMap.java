package com.java8Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

	public static void main(String[] args) {

List<Customer> list= new ArrayList<Customer>();
list.add(new Customer("Silpa","gyfdf@gmail.com",List.of("48726384","667653633")));
list.add(new Customer("Debasish","gyrfdf@gmail.com",List.of("487216384","6627653633")));
list.add(new Customer("Varsha","oyfdf@gmail.com",List.of("47726384","667653033")));
list.add(new Customer("Xaviar","xyfdf@gmail.com",List.of("481726384","6617653633")));

//Using MAP
List<String> name =list.stream().map(Customer::getName).collect(Collectors.toList());
System.out.println(name);

//Using flat map
list.stream().map(Customer :: getPhoneNumbers).collect(Collectors.toList()).forEach(System.out::print);//insterd of this we can use flat map

System.out.println("================");


list.stream()
.flatMap(customer -> customer.getPhoneNumbers().stream())  // Flatten the list of phone numbers
.collect(Collectors.toList())
.forEach(System.out::println);


	}

}
