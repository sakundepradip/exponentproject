package com.list;

import java.util.Iterator;
import java.util.List;

public class worldcountrymain {
	
	public static void main(String[] args) {
		
		List<List<String>>	world=allcuntrys.addcuntry();
		System.out.println(world);
		
		System.out.println("--itrator data--");
		Iterator<List<String>> allcountry=world.iterator();
		while(allcountry.hasNext()) {
			List<String> country =allcountry.next();
			System.out.println(country);
			
               Iterator<String> countrys=country.iterator();
               while(countrys.hasNext()) {
            	   String state=countrys.next();
            	   System.out.println(state);
               }
		}
		System.out.println("----for each loop-----");
		for( List<String> countrys:world) {
			for(String stats:countrys) {
				System.out.println(stats);
			}
		}
	}

}
