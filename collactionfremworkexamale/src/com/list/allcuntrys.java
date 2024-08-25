package com.list;

import java.util.ArrayList;
import java.util.List;

public class allcuntrys {

	public static List<List<String>> addcuntry() {
		List<String> india=new ArrayList<String>();
		india.add("Maharashtra");
		india.add("Madhyapradesh");
		india.add("Karnataka");
		india.add("Utterpradesh");
		india.add("Delli");
		
		List<String> Australia=new ArrayList<String>();

		Australia.add(" Victoria");
		Australia.add(" Queensland");
		Australia.add(" South Australia");
		Australia.add(" Tasmania");
		Australia.add(" Northern Territory");

		List<String> Us=new ArrayList<String>();

		Us.add("California");
		Us.add("Texas");
		Us.add("Florida");
		Us.add("Virginia");
		Us.add("Idaho");

		List<String> London=new ArrayList<String>();

		London.add("Camden");
		London.add("Greenwich");
		London.add("Hackney");
		London.add("Islington");	
		London.add("Lambeth");
		
		
		List<List<String>> world=new ArrayList<List<String>>();
		world.add(india);
		world.add(Australia);
		world.add(Us);
		world.add(London);
		

		return world;

	}
}
