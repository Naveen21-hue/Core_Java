package Polymorphoism;

public class MethodOverLoading {
	//without add parameters
	public void add() {
		int a=10,b=30;
		System.out.println(a+b);
	}
	//with single parameter
	public void add(int a) {
		int b=40;
		System.out.println(a+b);
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String name) {
		System.out.println("main method");
	}
	
	

	public static void main(String[] args) {
		 MethodOverLoading m=new  MethodOverLoading();
		 m.add();
		 m.add(40);
		 m.add(20, 30);
		 m.main("naveen");
		 
		 
		 
		
		
	}

}
