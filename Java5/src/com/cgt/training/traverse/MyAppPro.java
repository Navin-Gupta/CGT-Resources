package com.cgt.training.traverse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		List<StringBuffer> list = new ArrayList<>();
		
		list.add(new StringBuffer("First"));
		list.add(new StringBuffer("Second"));
		list.add(new StringBuffer("Third"));
		list.add(new StringBuffer("Fourth"));
		
		// using iterator
		/*Iterator<StringBuffer> iterator = list.iterator();
	
		while(iterator.hasNext()) {
			StringBuffer str = iterator.next();
			System.out.println(str);
			str.append("Pro");
		}*/
		
		for(StringBuffer str : list) {  // hides the remove
			System.out.println(str);
			str.append("Pro");
		}
		
		System.out.println(list);
	}

}
