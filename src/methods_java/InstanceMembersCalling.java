package methods_java;

public class InstanceMembersCalling {
	static InstanceMethod iref;//variable declaration
	
	 public void insatnceMethod() {
		 System.out.println(iref.l);
		 
		 
		
	}

	public static void main(String[] args) {
		//classname variablename = new classname();
		
		iref=new InstanceMethod();//varable intilalization
		//objref.variablename();
		System.out.println(iref.l);
		System.out.println(iref.c);
		System.out.println(iref.getRandomNumber());
		
		
		
		

		
		
		
		
		
		
		
		

	}

}
