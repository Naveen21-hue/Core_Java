package oops;

public class Constructor {
	//default constructor
	//accessmodifier classname(){logic}
	 public Constructor() {
		 System.out.println(" this is default constuctor");
		 
	 }
	//parameterised constructor
	//accessmodifier classname(val1,va;2,..){logic} 
	 public Constructor(String name) {
		 System.out.println(" this is parameterised constructor-1");
		 System.out.println(name);
	 }
	 public Constructor(String fname,String lname) {
		 System.out.println(" this is parameterised constructor-2");
		 System.out.println(fname +lname);
	 }
	 public Constructor(int num) {
		 System.out.println(" this is parameterised constructor-3");
		 System.out.println(num);
	 }



	public static void main(String[] args) {
		//create object
		//classname objref=new classname();
		Constructor objref1=new Constructor();
		Constructor objref2=new Constructor("naveen");
		Constructor objref3=new Constructor("naveen", "kaithepalli");
		Constructor objref4=new Constructor(20);
		

	}

}
