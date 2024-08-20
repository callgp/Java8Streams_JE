package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListBankObjectFilerNameStartsWithRon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String[] names= {"java","python","unix","ppp"};
		
		List<Bank> asList =new ArrayList<>();
			asList.add(new Bank("ron",34));
			asList.add(new Bank("mike",33));
			asList.add(new Bank("john",31));
			asList.add(new Bank("ron",38));		
		
	List<Bank> filteredNames=	asList.stream()
		.filter(bank-> bank.getName() != null && bank.getName().startsWith("ron"))
		.collect(Collectors.toList());
		
	filteredNames.forEach(System.out::println);
		}
	

}
