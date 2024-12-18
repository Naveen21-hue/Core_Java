package controlstatements;

public class IfElseIf {

	public static void main(String[] args) {
		boolean b1=false,b2=true;
		if(b1&&b2) {//....false
			System.out.println("b1 and b2 is condition true")	;
			}
		else if(b1||b2) {//.....true
			System.out.println(" b1 and b2 conditions is true");
			
		}
		else if(b1!=b2) {//....true
			System.out.println("b1 and b2 condition is true");
			
		}
		else {
			System.out.println("all conditions are false");
		}
		

	}

}
