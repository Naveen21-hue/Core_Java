package controlstatements;

public class SimpleIf {
	public void returnDecesion() {
		int a=10;
		int b=20;
		if(a<b) {//10<20.....true
			System.out.println("a is big");
		}
	
		System.out.println("excuted if block outside statement succesfully");
	}
	public static void main(String[] args) {
		//classname varablename=new classname();
		SimpleIf sref=new SimpleIf();
		//objref.methodname();
		sref.returnDecesion();
		

	}

}
