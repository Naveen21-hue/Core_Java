package com.collectionpractice;

import java.util.ArrayList;

public class ArrayListSearch {

	public static void main(String[] args) {
ArrayList<String> colours=new ArrayList<>();
		
		colours.add("red");
		colours.add("green");
		colours.add("pink");
		colours.add("white");
		colours.add("orange");
		 
		System.out.println(colours);
		
		String s="red";
		 if(colours.contains(s)) {
			 System.out.println("red colour element is there");
			 
		 }else {
			 System.out.println("red colour element is not  there");
			 
		 }
		
		 
		 

	}

}
