package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListBankObjectFilerNameUsingFilterNotPredicateAndStartsWithRon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String[] names= {"java","python","unix","ppp"};
		
		List<Bank> asList =new ArrayList<>();
			asList.add(new Bank("ron",34));
			asList.add(new Bank("mike",33));
			asList.add(new Bank("john",31));
			asList.add(new Bank("rons",38));		
		
			Function<Bank,String> f=bank->bank.getName();
	List<String> filteredNames=	asList.stream()
		.filter(bank-> bank.getName() != null && bank.getName().startsWith("ron"))
		.map(f)
		.collect(Collectors.toList());
	//System.out.println(name);
		
	filteredNames.forEach(System.out::println);
		}
	

}
