package methods_java;

public class InsideCalling {
	//ststic to static
	public static void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		
	}
	//static to instance
	//accessmodifier returntype methodname(){   }
	public void swapNumbers() {
		
		add();//static to instance
		int a=5;
		int b=10;
		System.out.println("a&b values before swapping a:"+a+", b:"+b);
		a=a+b;//15
		b=a-b;//5
		a=a-b;//10
		System.out.println("a&b values after swapping a:"+a+", b:"+b);
				
	}
	//instance to instance
	//am returntype methodnanamw(data var1,datavar2,..){       }
	public void averageTwoNumbers(int a,int b) {
		int c=a+b/2;
		swapNumbers();//.............>instance to instance calling
	    System.out.println("a,b numbers average "+c);
	}

	public static void main(String[] args) {
		
		 add();//......>static to static
		//classname variablename= new classname();
		InstanceMethod obj=new InstanceMethod();
		//objref.methoname();
		obj.swapNumbers();
		
		
	}
}

