package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> numbers=new TreeSet<>();
		
		numbers.add(10);
		numbers.add(5);
		numbers.add(15);
		numbers.add(40);
		numbers.add(9);
		
		for(Integer n:numbers) {
			System.out.println(n);
		}
		
		

	}

}
