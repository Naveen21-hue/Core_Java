package methods_java;
//import packagename.classname;
  import varaibles_java.Logic;

 
  public class Calling {
	   Logic iref=new Logic();
	
	
	  public void print() {
		  int num=iref.num();
		  System.out.println(num);
	  }

	public static void main(String[] args) {
		Calling c=new Calling();
		c.print();
		
	}

}
