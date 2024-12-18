package methods_java;

public class InstanceMethod {
	public long l=24;
	char c='N';
	
	//1.with void without parameters
	//accessmodifier returntype methodname(){    }
	public void swapNumbers() {
		int a=5;
		int b=10;
		System.out.println("a&b values before swapping a:"+a+", b:"+b);
		a=a+b;//15
		b=a-b;//5
		a=a-b;//10
		System.out.println("a&b values after swapping a:"+a+", b:"+b);
				
	}
	//2.with void with parameters
	//accessmodifier returntype methodname(datatype var1,datatype var2){
	 public  void averageTwoNumbers(int a,int b) {
		 int c=(a+b)/2;
		 System.out.println("a,b numbers average "+c);
	 }
	 //3.with returntype without parameters
	 //accessmodifier returntype methodname(){
	 public int getRandomNumber() {
		 int d=(int) (Math.random()*200);
		 return d;
	 }
	 //4.with returntype with parameters
	 //accessmodifier returntype methodname(datatype var1,datatype var2){
	 protected String getUserName(String fname,String lname) {
		 String fullName= (fname +" "+ lname);
		 return fullName;
		 
		 
	 }
		 
		 
		 
	 
	 

	public static void main(String[] args) {
		//1.create object
		//classname objref=new classname();
		InstanceMethod obj=new InstanceMethod();
		
		//how to call instance methods in static method
		//objref.Instancemethod();
		obj.swapNumbers();
		
		//2.objref.Instancemethod();
		obj.averageTwoNumbers(20,10 );
		
		//3.datatype varablename=obj.methodname();
		int random_Number=obj.getRandomNumber();
		System.out.println(random_Number);
		
		String user_name=obj.getUserName("NAVEEN","KAITHEPALLI");
		System.out.println(user_name);
	}

}
