package com.collectionpractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayCopy {

	public static void main(String[] args) {
   ArrayList<String> colours=new ArrayList<>();
		
		colours.add("red");
		colours.add("green");
		colours.add("pink");
		colours.add("white");
		colours.add("orange");
		 
		System.out.println(colours);
   ArrayList<String> names=new ArrayList<>();
   
   names.add("apple");
   names.add("banana");
   names.add("orange");
   names.add("dragon");
   System.out.println(names);
   
   Collections.copy(colours, names);
   
   System.out.println("ArrayList1"+colours);
  
   
   
   
   
   
   
		

	}

}
