package com.cgt.training.convert;

import java.util.Arrays;
import java.util.List;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sarr[] = new String[] {"First", "Second", "Third", "Fourth"};
		
		// System.out.println("Array :"  + sarr);
		System.out.println("Array : " + Arrays.toString(sarr));
		
		// convert into collection object
		List<String> list =  Arrays.asList(sarr);
		System.out.println("List : " + list);
		
		list.set(2, "New Value");
		sarr[1] = "Some new data";
		
		System.out.println("List : " + list);
		System.out.println("Array : " + Arrays.toString(sarr));
	}

}
