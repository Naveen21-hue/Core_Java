package com.collectionpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {

	public static void main(String[] args) {
		
  ArrayList<String> colours=new ArrayList<>();
		
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		colours.add("white");
		colours.add("orange");
		
		Iterator it=colours.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

		}
	}

}
