package com.list;

import java.util.Iterator;
import java.util.List;

public class countrymainmethod {

	public static void main(String[] args) {

		List<List<String>> india = cuntry.addcountry();
		System.out.println(india);

		Iterator<List<String>> itr = india.iterator();
		while (itr.hasNext()) {

			List<String> str=itr.next();
			//System.out.println(str);
			Iterator<String> state=str.iterator();
			while(state.hasNext()) {
				String city =state.next();
				System.out.println(city);
			}
		}
		
		for(	List<String> state:india) {
			for (String city : state) {
				System.out.println(city);
				
			}
			
		}
	}

}
