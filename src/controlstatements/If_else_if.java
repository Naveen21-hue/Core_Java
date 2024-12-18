package controlstatements;

public class If_else_if {

	public static void main(String[] args) {
	int a=50,b=40,c=30;
	 
	if(a>b&&a>c) {
		System.out.println("a is big");
		
	}else if(b>a&&b>c) {
		System.out.println("b is big");
	}else if(c>a&&c>b) {
		System.out.println("c is big");
	}else{
		System.out.println("all are equal");
		
	}
	System.out.println("completed if block code excuted");

	}

}
