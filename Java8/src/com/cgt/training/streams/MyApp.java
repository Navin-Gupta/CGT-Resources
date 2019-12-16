package com.cgt.training.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyApp {

	static List<String> names = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		names.add("First");
		names.add("Second");
		names.add("Third");
		names.add("Fourth");
		names.add("Fifth");
		
		// Consumer<String> printConsumer = name -> System.out.println(name);
		// Consumer<String> printConsumer = System.out :: println;
		
		Stream<String> namesStream =  names.stream();
		
		// namesStream.forEach(printConsumer);
		// namesStream.forEach(name -> System.out.println(name));
	    // namesStream.forEach(System.out :: println);
		/*List<String> newNames = names.stream().peek(name -> System.out.println("Streamed : " + name)) // Stream<String> ALL data
			.filter(name -> name.startsWith("F") && name.length()<=5).peek(name -> System.out.println("Filtered : " + name)) // Stream<String> filtered
			.map(name -> name.toUpperCase()).peek(name -> System.out.println("Transformed : " + name)) // Stream<String> Uppercase
			.collect(Collectors.toList());*/
		
		
		names.stream().peek(name -> System.out.println("Streamed : " + name)) // Stream<String> ALL data
		.filter(name -> name.startsWith("F") && name.length()<=5).peek(name -> System.out.println("Filtered : " + name)) // Stream<String> filtered
		.map(name -> name.toUpperCase()).peek(name -> System.out.println("Transformed : " + name)); // Stream<String> Uppercase
		
		
		// System.out.println(newNames);
	}

}
