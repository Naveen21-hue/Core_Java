package com.strings;

import java.util.HashMap;
import java.util.Map;

public class RverseString {
	public static void reversestring() {
		String s="automation";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
			
		}
	}
    //To check String is palindrome or not
	public static void checkPlaindromeOrNot(String text) {
		String s=text;
		String reverse="";
		for(int i=text.length()-1;i>=0;i--) {
		reverse=reverse+s.charAt(i);	
		}
		if(s.equals(reverse)) {
			System.out.println("given text is palindrome");
		}else {
			System.out.println("given text is not palindrome");

			
		}
		
			}
	
	//Reverse the words
     public static void reverseWords(String s) {
    	 String[] words=s.split(" ");
    	 for(int i=words.length-1;i>=0;i--) {
    		 System.out.print(words[i]+" ");
    		 
    	 }
     }
     
     //Count of each Character in the String
     public static void countOfCharacter(String s) {
    	 
    	 Map<Character,Integer>name=new HashMap<>();
    	 
    	 char[] ch=s.toCharArray();
    	 for(char c:ch) {
    		 if(name.containsKey(c)) { 
    			int x=name.get(c);
    			name.put(c,x+1);
    		 }else {
    			 name.put(c,1);
    		 }
    		 
    	 }
    	 System.out.println(name);
    	 
     }
     
     
     public static void countOfString(String s) {
    	 
    	 Map<String,Integer> emp=new HashMap<String,Integer>();
    	 
    	 String[] s1=s.split(" ");
    	 for(String c:s1) {
    		 if(emp.containsKey(c)) {
    			 emp.put(c,emp.get(c)+1);
    		 }else {
    			 emp.put(c,1);
    		 }
    	 }
    	 System.out.println(emp);
     }
     
    	 
    	


     

     
     
     
     
     
     

	public static void main(String[] args) {
		//reversestring() ;
		//checkPlaindromeOrNot("peep");
		//reverseWords("welcome to java");
		countOfCharacter("testing");
		//countOfString("venkat ram ");
		 

	}
}
