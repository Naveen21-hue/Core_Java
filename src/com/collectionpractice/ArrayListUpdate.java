package com.collectionpractice;

import java.util.ArrayList;

public class ArrayListUpdate {

	public static void main(String[] args) {
		
   ArrayList<String> colours=new ArrayList<>();
		
		colours.add("red");
		colours.add("green");
		colours.add("pink");
		colours.add("white");
		colours.add("orange");
		 
		System.out.println(colours);
		
		//how to update the elements...set
		colours.set(0, "blue");
		System.out.println(colours);
		
		

	}

}
