package com.strings;

public class StringMethods {

	public static void main(String[] args) {
		//how to create a string
		//datatype variablename=value;
		String name="core java";
		
		System.out.println("Lenth of name string :"+name.length());
		
		System.out.println("3 index value :"+name.charAt(3));
		
		System.out.println("extracting string by using substring: "+name.substring(5));
		
        String s=" Learn new Learn ";
        
        System.out.println("first index of value is:"+s.indexOf("ea"));
        
        System.out.println("index of value is:"+s.indexOf("ea",2));
        
        System.out.println("last index of value is:"+s.lastIndexOf("rn"));
        
        boolean b=s.equalsIgnoreCase("learn new learn");
        System.out.println(b);
        
        int value=name.compareTo(s);
        System.out.println(value);
        
        System.out.println("converts all charactrs in lower case:"+s.toLowerCase());
        
        System.out.println("converts all charactrs in upper case:"+s.trim().toUpperCase());
        
        System.out.println("repalce a charcter value:"+s.replace('n', 'm'));
        
        char[] ch=s.toCharArray();
        for(char c:ch) {
        	System.out.print(c);
        }
        
        int i=1000; //int to string 
        String ivalue=String.valueOf(i);
        System.out.println(ivalue);
        
        String d="999";
        int d2=Integer.parseInt(d);
        System.out.print(d2);
        
        System.out.println(s.concat(name));


        
	}

}
