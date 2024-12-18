package controlstatements;

public class Print_EVenNumbers {
	public static void printEvenNumbers() {
		int i=1;
		
		while(i<=10) {
			if(i%2==0) {
				System.out.print(i+",");
			}
			i++;
		}
		
		
	}
	//divisibles  
	public static void divWHi(int n) {
		int i=1;
		while(i<=10) {
			System.out.println(n+" x "+i+ " ="+(n*i));
					i++;
	
		}
	}
	//odd numbers
	public static void OddNumbers() {
		int i=1;
		while(i<=10) {
			if(i%2!=0) {
				System.out.print(i+",");
			}
			i++;
		}
	}
	//factorial                exp:5!=5*4*3*2*1=120
	
	public static void Factorial() {
		int i=1;
		int fact=1;
		while(i<=6) {
			fact=fact*i;
		i++;
		
		}
		System.out.print(fact);
	}
		
	
	public static void main(String[] args) {
		printEvenNumbers();
		//divWHi(15);
		//OddNumbers();
		//Factorial() ;
		
	}

}
