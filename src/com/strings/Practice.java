package com.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Practice {
	public static  void reverseString() {
	String s="auomation";
	for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
		
	}
	}
	
	public static void checkPalindromeOrNot(String text) {
		String s=text;
		String reverse="";
		for(int i=text.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
			
		}
		if(s.equals(reverse)) {
			System.out.println("given text is palindrome");
		}
		else {
			System.out.println("given text is not palindrome");
		}
	}
		
		public static void reverseWords(String s) {//welcome to java to java to welcome
			String[] words=s.split(" ");
			for(int i=words.length-1;i>=0;i--) {
				System.out.print(words[i]+" ");
			}
		
	}
		public static void findDuplicateWords(String s) {  //going to mumbai to have meeting 
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
		
		public static void swapOfTwoStrings(String s1,String s2) { 
			
			s1=s1+s2;
			s2=s1.substring(0,s1.length()-s2.length());
			s1=s1.substring(s2.length(),s1.length());
			System.out.println(s1);
			System.out.println(s2);

			
		}
		
		public static void firstRepeatedCharacter(String s) {
			char[] ch=s.toCharArray();
			
			HashSet<Character> repeat=new HashSet<>();
			
			for(char c:ch) {
				if(!repeat.contains(c)) {
					repeat.add(c);
				}
				else {
					System.out.println(c);
					break;
				}
			}
		}
		

		public static void firstNonRepeatedCharacter(String s) {
			char[] ch=s.toCharArray();
			
			HashSet<Character> nonrepeat=new HashSet<>();
			
			for(char c:ch) {
				if(nonrepeat.contains(c)) {
				
				}
				else {
					if(s.indexOf(c)==s.lastIndexOf(c)) {
						System.out.println(c);
						break;
					}else {
						nonrepeat.add(c);
					}
				}
			}
			
		}
		
		public static void dulicates(String s) {
			
			for(int i=0;i<s.length();i++) {
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						System.out.println(s.charAt(i));
						break;
					}
				}
			}
		}
		
		 public static void uniqueElements(String s) {
			 char[] ch=s.toCharArray();
			 
			 Set<Character> elements=new HashSet<>();
			 
			 for(char c:ch) {
				 elements.add(c);
			 }
			 System.out.println(elements);
			 
		 }
		 
		 public static void reverseStringPreservingSpacesPosition(String s) {
			 String reverse=" ";
			 char[] ch=s.toCharArray();
			 
			 Set<Integer> spaces=new TreeSet<>();
			 for(int i=s.length()-1;i>=0;i--) {
				 if(ch[i]!=' ') {
					 reverse=reverse+ch[i];	 
				 }
				 else {
					 spaces.add(i);
					 
				 }
			 }
			 StringBuffer s1=new StringBuffer(reverse);
			 
			 for(int i:spaces) {
				 s1.insert(i,' ');
			 }
			 System.out.println(s1);
				 
			 
			 }
		 
		 public static void chechAnagramOrNotString(String s1,String s2) {
			 
			 if(s1.length()==s2.length()) {
				 
				 s1=s1.toLowerCase();
				 s2=s2.toLowerCase();
				 
				 char[] c1=s1.toCharArray();
				 char[] c2=s2.toCharArray();
				 
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
		 
		 public static void countOfEachCharacter(String s) {
			 char[] ch=s.toCharArray();
			 
			 Map<Character,Integer> str=new HashMap<>();
			 
			 for(char c:ch) {
				 if(str.containsKey(c)) {
					 str.put(c,str.get(c)+1);
						 
				 }else {
					 str.put(c,1);
				 }
			 }
			 System.out.println(str);
		 }
		 


			
		

	
	
	

	


	public static void main(String[] args) {
		//reverseString();
		//checkPalindromeOrNot("radar");
		//reverseWords("welcome to java");
		//findDuplicateWords("going to mumbai to have meeting");
		//swapOfTwoStrings("core","java");
		//firstRepeatedCharacter("radar");
		//firstNonRepeatedCharacter("radar");
		//dulicates("testing");
		uniqueElements("radar");
		//reverseStringPreservingSpacesPosition("who is he");
		//chechAnagramOrNotString("Listen","Silent");
		
		//countOfEachCharacter("written");
		
		
		

	}
}
	
