package com.collections;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//create ArrayList collection
		//classname<datatype> collectioname=new classname<datatype>();
		ArrayList<String> names=new ArrayList<>();
		
		//how to insert values into collection
		names.add("Naveen");
		names.add("siva");
		names.add("Jack");
		names.add("Chimtu");
		
		//how to insert value in specific position
		names.add(1,"Ramu");
		
		//how to check element in specific position or not  >contains
		boolean b=names.contains("Siva");
		 System.out.println(b);
		 
		 //how to get the collection value....>using get(index);
		 System.out.println(names.get(2));
		 
		 //how to update value in collection....> using set(index,values);
		 names.set(0,"Raju");
		 System.out.println(names.get(0));
		 
		 //how to remove the element from collection...>remove(value);
		     names.remove("Raju");
		     System.out.println("==========================");
		     
		  //create coolection 2
		     ArrayList<String> names2=new ArrayList<>();
		
				names2.add("ntr");
				names2.add("nani");
				
	     //how to call one collection into another
				names.addAll(names2);
				System.out.println(names.size());
	     //how to clear all elements in a collection....>clear();
		  // names.clear();
		  // System.out.println(names.size());
		   
		   System.out.println(names.isEmpty());
		   
		   System.out.println(names.lastIndexOf("nani"));
		  
		   System.out.println(names.indexOf("siva"));
		   
		   Object[] collectionValues=names.toArray();
		    
		   for(Object eachvalue:collectionValues) {
			   System.out.println(eachvalue);
			   
		   }
		   
		   System.out.println("==========================");
		   //how to remove all elements based on collection.....removeall  
		     names.removeAll(names2);
		     
		     
		//iterate collection .....>iterator or for eachloop
         Iterator it=names.iterator();
         while(it.hasNext()) {
        	 System.out.println(it.next()); 
        	 
         }
        
         
	}

}
