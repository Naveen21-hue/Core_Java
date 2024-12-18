package methods_java;

public class StaticMembersCalling {
	public void print() {
		StaticMethod.add();
	}

	public static void main(String[] args) {
		//classname objref=new classname();
		StaticMembersCalling iref=new StaticMembersCalling();
		//obref.methodname();
		iref.print();
		
		//classname.methodname/variablename()
		System.out.println(StaticMethod.num);
		System.out.println(StaticMethod.day);
		
		//methods
		//classname.methodname
		StaticMethod.squareValue();
		
		StaticMethod.checkCondition(false, false);
		
		
	
		
	}

}
