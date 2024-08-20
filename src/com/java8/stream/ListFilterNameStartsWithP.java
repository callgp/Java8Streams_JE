package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilterNameStartsWithP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"java","python","unix","ppp"};
		
		List<String> asList = Arrays.asList(names);
		
	List<String> filteredNames=	asList.stream()
		.filter(name->name.toLowerCase().startsWith("p"))
		.collect(Collectors.toList());
		
	filteredNames.forEach(System.out::println);
		}
	

}
