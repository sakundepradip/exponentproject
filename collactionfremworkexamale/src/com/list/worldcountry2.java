package com.list;

import java.util.ArrayList;
import java.util.List;

public class worldcountry2 {
	
	public static List<List<List<String>>> addcountry() {
		
		List<String>maharashtra=new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("mumbai");
		
		
		List<String>rajsthan=new ArrayList<String>();
		rajsthan.add("jaypur");
		rajsthan.add("kota");
		
		List<List<String>> india =new ArrayList<List<String>>();
		india.add(maharashtra);
		india.add(rajsthan);
		
		List<String>Texas=new ArrayList<String>();

		Texas.add("Houstan");
		Texas.add("dalls");
		
		List<String> Florida=new ArrayList<String>();
		Florida.add("miami");
		Florida.add("tampa");

		
		List<List<String>> usa =new ArrayList<List<String>>();
		usa.add(Texas);
		usa.add(Florida);
		
		List<List<List<String>>> country=new ArrayList<List<List<String>>>();
		country.add(india);
		country.add(usa);


		return country;
		
		
	}

}
