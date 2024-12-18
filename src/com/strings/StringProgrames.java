package com.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringProgrames {
	
	public static void findDuplicateWords(String s) {
		String[] words=s.split(" ");
		for(int i=0;i<words.length-1;i++) {
			String compare=words[i];
			for(int j=i+1;j<words.length-1;j++) {
				if(compare.equals(words[j])) {
					System.out.println(compare);
				}
			}	
		}
	}
	
	//swap of two strings without third variable
	public static void swapOfTwoStrings(String s1,String s2) {  // core java 
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length(), s1.length());
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
	//find the repeated character in a string
	public static void firstRepeatedCharacter(String s) {   //radar
		char[] ch=s.toCharArray();
		
		HashSet<Character> repeat=new HashSet<>();
		for(char c:ch) {
			if(repeat.contains(c)) {
				repeat.add(c);
			}else {
				System.out.println(c);
				break;
			}
		}
	}
	
	
		
	//find First NonRepeatedCharacter
	public static void firstNonRepeatedCharacter(String s) {
        char[] ch=s.toCharArray();
        HashSet<Character> nonrepeat = new HashSet<>();
        
        for(char c:ch) {
        	if(nonrepeat.contains(c)) {
        		
        	}else {
        		if(s.indexOf(c)==s.lastIndexOf(c)) {
        			System.out.println(c);
        			break;
        		}else {
        			nonrepeat.add(c);
        			
        		}
        	}
  
        }

        
	}
        
        
        
	//Find Duplicate Characters In A String 
	 public static void dulicates(String s) {
				   
		        for (int i = 0; i<s.length(); i++) {
		            for (int j =i+1; j<s.length(); j++) {
		                if (s.charAt(i) == s.charAt(j)) {
		                    System.out.print("Duplicate Character: " + s.charAt(i));
		                    break;
		                }
		            }
		        }
		    }
	 
	 //find unique characters in string
	 public static void uniqueElements(String s) {
		 char[] ch=s.toCharArray();
	        Set<Character> elements = new HashSet<>();
	        for(char c:ch) {
	        	elements.add(c);
	        	
	        }
	        System.out.println(elements);

	 }

	 
			
		
	

	public static void main(String[] args) {
		//findDuplicateWords("going to mumbai to have meeting ");
		//swapOfTwoStrings("core","java");
		//firstRepeatedCharacter("radar") ;
		// duplicateCharacters("testing");
		//firstNonRepeatedCharacter("radar") ;
		 //dulicates("testing");
		//uniqueElements("swss");
		 uniqueElements("aabbcd") ;
	}
}
		