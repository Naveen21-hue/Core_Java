package com.collectionpractice;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		
   ArrayList<String> colours=new ArrayList<>();
		
		colours.add("red");
		colours.add("green");
		colours.add("pink");
		colours.add("white");
		colours.add("orange");
		 
		System.out.println(colours);
		
		//how to remove the elements....>remove
		colours.remove(3);
		System.out.println(colours);
		
		
		

	}

}
