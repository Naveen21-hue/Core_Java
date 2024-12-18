package com.collectionpractice;

import java.util.ArrayList;

public class ArrayListEmptyNOt {

	public static void main(String[] args) {
		 ArrayList<String> colours=new ArrayList<>();
			
			colours.add("red");
			colours.add("green");
			colours.add("pink");
			colours.add("white");
			colours.add("orange");
			 
			System.out.println(colours);
			System.out.println(colours.isEmpty());
			colours.clear();
			System.out.println(colours.isEmpty());
			
			
	}

}
