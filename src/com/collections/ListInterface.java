package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListInterface {

	public static void main(String[] args) {
		//create arrayList collection
		//classname<datatype> collectionname=new classname<>();
		 ArrayList<String> name=new  ArrayList<>();
		 
		 //using add method
		 name.add("Naveen");
		 name.add("ramu");
		 name.add("pandu");
		 name.add("jack");
		 
		 //how to check the elements in specific position
		 boolean b=name.contains("pandu");
		 System.out.println(b);
		 
		 //how to get the elements
		 System.out.println(name.get(2));
		 
		 //how to update the element
		 name.set(3, "siva");
		 System.out.println(name.get(3));
		 
		 //how to remove element
		 name.remove(0);
		 name.set(0,"Naveen");
		 
		 
		 System.out.println("===================");
 ArrayList<String> name2=new  ArrayList<>();
		 
		 name2.add("ntr");
		 name2.add("nani");
		 
		 name.addAll(name2);
		 
		 
		 
		 //using iterrator interface iterate the elements
		 Iterator it=name.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		
	}

}
