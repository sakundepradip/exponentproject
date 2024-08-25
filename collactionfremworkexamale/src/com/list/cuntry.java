package com.list;

import java.util.ArrayList;
import java.util.List;

public class cuntry {

	public static List<List<String>> addcountry() {

		List<String> maharasshtra = new ArrayList<String>();
		//maharasshtra.add("---Maharashtra Country-----");
		maharasshtra.add("Pune");
		maharasshtra.add("Mumbai");
		maharasshtra.add("Nashik");
		maharasshtra.add("Beed");
		maharasshtra.add("Nagar");

		List<String> madhypradesha = new ArrayList<String>();
		//madhypradesha.add("-----Madhypradesha-------");
		madhypradesha.add("Gwalior");
		madhypradesha.add("Jabalpur");
		madhypradesha.add("Bhopal");
		madhypradesha.add("Sagar");
		
		List<String> Karnatak = new ArrayList<String>();
		//Karnatak.add("----Karnatak City-------");
		Karnatak.add("Bengaluru");		
		Karnatak.add("Mangaluru");
		Karnatak.add("Chitradurga");
		Karnatak.add("Shivamogga");
		Karnatak.add("Udupi");

		List<List<String>> india=new ArrayList<List<String>>();
		india.add(maharasshtra);
		india.add(madhypradesha);
		india.add(Karnatak);


		return india;
	}
}
