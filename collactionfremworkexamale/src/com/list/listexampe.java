package com.list;

import java.util.ArrayList;
import java.util.List;

public class listexampe {
	
	public static void main(String[] args) {
		System.out.println("main method ");
		
		List al=new ArrayList();
		
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add("pradip");
		al.add(19.19);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(4));
		System.out.println(al.size());
		System.out.println(al.contains(141));
		System.out.println(al.isEmpty());
		
	}

}
