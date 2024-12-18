package methods_java;
  
  
public class StaticMethod {
	protected static int num=210;
    public static String day="sunday";

	//1.with void without parameters
	//accessmodifier static returntype methodname(){logic}
	public static void add() {
		int a=21;
		int b=37;
		int c=a+b;
		System.out.println(c);
	}
	
	//2.with void with parameters
	//accessmodifier static returntype methodname(datatype var1,datatypevar2){logic}
	
	 public static void printFLnames(String fname,String lname) {
		System.out.println(fname+" "+lname);
		
		}
	 
	 //3.without returntype without parameters
	 //accessmodifier static returntype methodname(){    }
	    public  static int squareValue() {
	    	int b=3*7;
	    	System.out.println(b);
	    	return b;
	    }
	    
	    //4.without void(returntype) with parameters
	    //accessmodifier static datatype methodname(datatype var1,datatype var2,...etc){  }
	    public static boolean checkCondition(boolean b1,boolean b2) {
	    	boolean b3=b1 && b2;//result
	    	
	    	return b3;
	    }
	   

	    public static void main(String[] args) {
		add();
		printFLnames("Naveen","Kaithepalli");
		
		//datatype variablename=returntypemethod();
		int square=squareValue();
		
		//datatype variablename=returentypemethod(arg1,arg2);
		boolean b4=checkCondition(true,true);
		System.out.println(b4);
		System.out.println("checkCondition method return value "+checkCondition(true,true));
		
				
		
	}
}
		

	


