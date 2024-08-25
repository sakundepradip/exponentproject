package com.list;

import java.util.Iterator;
import java.util.List;

public class worldcountrymain2 {

	public static void main(String[] args) {
		
		List<List<List<String>>> country=worldcountry2.addcountry();
		System.out.println(country);
		
		System.out.println("---iterate data for itertor-----");
		Iterator<List<List<String>>> state=country.iterator();
		while(state.hasNext()) {
			List<List<String>>	 State=state.next();
		Iterator<List<String>>	city=State.iterator();
		while(city.hasNext()) {
			List<String> City=city.next();
			Iterator<String> str=City.iterator();
			while(str.hasNext()) {
				String Str=str.next();
				System.out.println(Str);
			}
			
		}
		}
		System.out.println("------for each loop------");
		for (List<List<String>> list : country) {
			for (List<String> List2 : list) {
				for (String List3 : List2) {
					System.out.println(List3);
				}
				
			}
		}
	}
}
