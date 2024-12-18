package com.collectionpractice;

import java.util.ArrayList;

public class ArrayListEmpty {

	public static void main(String[] args) {
  ArrayList<String> colours=new ArrayList<>();
		
		colours.add("red");
		colours.add("green");
		colours.add("pink");
		colours.add("white");
		colours.add("orange");
		 
		System.out.println(colours);
		colours.clear();
		System.out.println(colours);

	}

}
