package com.list;

import java.util.ArrayList;
import java.util.List;

public class MaharashtraallUnivercitys {
	
	public static List<List<String>> adduniversity() {
		
		List<String> pune=new ArrayList<String>();
		pune.add("Softwear Eggineer");
		pune.add("Medical");
				
		List<String> mumbai=new ArrayList<String>();
		mumbai.add("B Com");
		mumbai.add("MIIT");
		
		List<String> nashik=new ArrayList<String>();
		nashik.add("Bca");
		nashik.add("STANFORD");

		List<String> ChatrpatiSambhajinagar=new ArrayList<String>();
		ChatrpatiSambhajinagar.add("Mcs");
		ChatrpatiSambhajinagar.add("CALTECH");
		
		List<List<String>> allunivercity=new ArrayList<List<String>>();
		allunivercity.add(pune);
		allunivercity.add(mumbai);
		allunivercity.add(nashik);
		allunivercity.add(ChatrpatiSambhajinagar);
		
		
		return allunivercity;


		



	}

}
