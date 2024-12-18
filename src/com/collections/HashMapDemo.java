package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//creation of Map 
		HashMap<String,Object> m=new HashMap<>();
		
		//Adding the elements in the map
		m.put("Firstname"," Naveen");
		m.put("Lasttname"," Kaithepalli");
		m.put("Rollnumber"," 37");
		m.put("Address"," Rajupalem");
		m.put("fathername"," venkateshwararao");
		m.put("age", 22);
		
		
		//Retrieval of value from the map based on key
		System.out.println(m.get("Firstname"));
		
		//delete the elements 
		m.remove("age");
		
		//check condition if there or not
		System.out.println(m.containsKey("Address"));
		
		//update the values
	    m.putIfAbsent("age", "23");
	    
	    //size
	   System.out.println( m.size());
				
		
		System.out.println("======");
		
		Set<Map.Entry<String, Object>> entry=m.entrySet();	
		
		for(Map.Entry<String, Object> details:entry) {
			System.out.println(details);
				
		}
	
	}

}
