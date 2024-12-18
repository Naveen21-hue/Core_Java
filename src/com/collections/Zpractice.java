package com.collections;

import java.security.KeyStore.Entry;
import java.util.*;

public class Zpractice {

	
	public static void main(String[] args) {
		
		Map<String,Object>m=new TreeMap<>();
		
		m.put("Firstname"," Naveen");
		m.put("Lasttname"," Kaithepalli");
		m.put("Rollnumber"," 37");
		m.put("Address"," Rajupalem");
		m.put("fathername"," venkateshwararao");
		m.put("age", 22);
		
		
		System.out.println(m.get("age"));
		
		System.out.println(m.containsKey("Address"));
		
		
		
		Set<Map.Entry<String,Object>> name=m.entrySet();
		for(Map.Entry<String,Object> c:name) {
			System.out.println(c);
		}

		
		
		
				


		
				
		
		
		
		
	}

}
