package com.cgt.training.traverse;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		// using iterator
		Iterator<String> iterator = list.iterator();
	
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			if(str.equals("Third"))
				iterator.remove();
			str = str + "Pro";
		}
		
		/*for(String str : list) {  // hides the remove
			System.out.println(str);
			str = str + "Pro";
		}*/
		
		System.out.println(list);
		
		
		
	}
	

}
