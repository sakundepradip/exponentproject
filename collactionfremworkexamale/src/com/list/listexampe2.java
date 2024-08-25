package com.list;

import java.util.ArrayList;
import java.util.List;

public class listexampe2 {

	public static void main(String[] args) {
		System.out.println("Application Starated------");
		List al=new ArrayList();
		
		al.add(122);
		al.add(123);
		al.add(124);
		al.add(125);
		al.add(125);
		al.add(null);
		al.add(90.90);
		al.add("asd");
		al.add(null);
		
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.contains("asd"));
		System.out.println(al.isEmpty());
		System.out.println(al.get(0));
		
	}
}
