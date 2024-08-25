package com.list;

import java.util.Iterator;
import java.util.List;

public class Universitymainmethod {
	
	public static void main(String[] args) {
		
		List<List<String>> allunivercity=MaharashtraallUnivercitys.adduniversity();
		System.out.println(allunivercity);
		
		System.out.println("itertor data----------");
		Iterator<List<String>> university=allunivercity.iterator();
		while(university.hasNext()) {
			List<String> univer=university.next();
			//System.out.println(univer);
			Iterator<String> itr =univer.iterator();
			while(itr.hasNext()) {
				String uni=itr.next();
				System.out.println(uni); 
				
			}
		}
		System.out.println("for each loop");
		for(List<String> University: allunivercity) {
			for(String univercity : University) {
				System.out.println(univercity);
				
			}
			
		}
	}

}
