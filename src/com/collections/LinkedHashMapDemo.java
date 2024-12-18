package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> fruits=new TreeMap<>();
		
		
		 fruits.put("banana",100);
		 fruits.put("grapes",30);
		 fruits.put("dragon",50);
		 fruits.put("apple",150);
		 
		 
		Set<Map.Entry<String, Integer>>	entry= fruits.entrySet();
		for( Map.Entry<String, Integer> details:entry) {
			System.out.println(details);
		}

	}

}
