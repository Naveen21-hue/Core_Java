package com.strings;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StringProgrames1 {
	public static void reverseStringPreservingSpacesPosition(String s) {
		String reverse="";
		char[] ch=s.toCharArray();
		
		Set<Integer> spaces=new TreeSet<>();
		for(int i=s.length()-1;i>=0;i--) {
			if(ch[i]!=' ') {
				reverse=reverse+ch[i];	
			}else {
				spaces.add(i);
			}	
		}
		StringBuffer s1=new StringBuffer(reverse);
		for(int i:spaces) {
			s1.insert(i,' ');
		}
		System.out.println(s1);
		
	}
	
	//anagram or not 
	public static void chechAnagramOrNotString(String s1,String s2) {
		if(s1.length()==s2.length()) {
			
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			char[] c1=s1.toCharArray();
			char [] c2=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);

			boolean b=Arrays.equals(c1, c2);
			if(b) {
				System.out.println(" two strings are anagram");
			}else {
				System.out.println(" two strings are not anagram");
			}
		}else {
			System.out.println(" given two strings are not anagram");
		}
		
	}
	
	public static void main(String[] args) {
		reverseStringPreservingSpacesPosition("who is he");
		//chechAnagramOrNotString("Listen","silent");
		
	}

}
