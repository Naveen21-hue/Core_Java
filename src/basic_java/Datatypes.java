package basic_java;

public class Datatypes {
	static boolean bc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b= true;
		boolean b1=false;
		
		char c = 'A';
		
		byte x=10;
		short y=20;
		int z=30;
		long l=40;
		
		float f=20.5f;
		double d=200.50;
		
		boolean b2= x<y;// 10<20 --> true
		System.out.println("x<y result is"+b2);
		
		boolean b3= l>=(y+z); //40>= 50 ----> false
		System.out.println("l>=(y+z) result is "+b3);
		
		boolean b4= b2 && b3; //---> false
		System.out.println("b2&&b3 result is "+b4);
		
		boolean b5= b2 || b3; //---> true
		System.out.println("b2 || b3 result is "+b5);
		
		boolean b6= b2 != b5; // ----> false
		System.out.println("b2 != b5 result is "+b6);
		
		
	
		System.out.println(bc); //default value will return 


          

	}

}
