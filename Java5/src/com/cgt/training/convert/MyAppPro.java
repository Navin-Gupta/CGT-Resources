package com.cgt.training.convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<String> list = new ArrayList<>();
		
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");

		System.out.println("List : " + list);
		
		Object arr[] = list.toArray();
		String sarr[] = list.toArray(new String[0]);
		System.out.println("Array : " + Arrays.toString(sarr));
		
		
		list.set(2, "New Value");
		sarr[1] = "Some new data";
		
		System.out.println("List : " + list);
		System.out.println("Array : " + Arrays.toString(sarr));
		
		
	}

}
