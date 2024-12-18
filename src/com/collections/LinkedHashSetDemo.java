package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> names=new HashSet<>();
		 
		//how to insert values into collection
			names.add("Naveen");
			names.add("siva");
			names.add("Jack");
			names.add("Chimtu");
			names.add("Naveen");
			names.add("siva");

			
			//how to convert set into list collection
			
			//iterate collection .....>iterator or for eachloop
	         Iterator it=names.iterator();
	         while(it.hasNext()) {
	        	 System.out.println(it.next()); 
	        	 
	         }
	}

}
