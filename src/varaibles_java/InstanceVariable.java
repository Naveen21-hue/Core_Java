package varaibles_java;

public class InstanceVariable {
	//accessmodifier datatype variablename=value;
	public char ch='A';
	double d=200.5;
	

	public static void main(String[] args) {
		// We cannot instance varables directly into main method
		//using object we can call instance variables
		//syntax for an object
		//classname objref=new classname();
		
		InstanceVariable obj=new InstanceVariable();
		
		//we can call instance variables by usig>objrefvar.instance variablename
		
		System.out.println(obj.ch);
		System.out.println(obj.d);

	}

}
