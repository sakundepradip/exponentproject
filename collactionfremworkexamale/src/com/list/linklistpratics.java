package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class linklistpratics {
	
	public static void main(String[] args) {
		
		System.out.println("arrylist data");
		 List<String> link=new ArrayList<String>();
		 link.add("acv");
		 link.add("abc");
		 link.add("aman");
		 link.add("mop");
		 
		 System.out.println("iterate data");
		 Iterator<String> itr=link.iterator();
		 while(itr.hasNext()) {
			String str= itr.next();
			 System.out.println(str);
		 }
		 System.out.println("for each loop data iterat");
		 for(String name :link) {
			 System.out.println(name);
			 
		 }
		 
		 LinkedList<String> name=new LinkedList<String>();
		 name.add("amol");
		 name.add("pradip");
		 name.add("sam");
		 name.add("rohit");
		 
		 System.out.println(name);
		 System.out.println(name.isEmpty());
		 System.out.println(name.remove(2));
		 System.out.println(name);
		 System.out.println(name.contains("amol"));
		 System.out.println("iterate data");
		 
		 Iterator<String> itre=name.iterator();
		 while(itre.hasNext()) {
			 String str=itre.next();
			 System.out.println(str);
		 }
		 System.out.println("for each loop data iterat");
		 for(String namee: name) {
			 System.out.println(namee);
		 }
	}

}
