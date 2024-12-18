package controlstatements;
         //reminder zero
public class While_Divisibles1 {
	public static void print4Divisibles(int n) {
	int i=1;
	int count=0;
	while(i<=n&&!(count==10)) {
		if(i%4==0) {
			System.out.print(i+" , ");
			count++;
			
		}
		i++;
	}
	}
	
	
	//print even number
	public static void printEvenNumbers() {
		int i=1;
	    while(i<=10) {
			if(i%2==0) {
				System.out.print(i+",");
						
		}
			i++;
	}
		
	}
	//multiplication
	public static void printMultiplicationTable(int n) {
		int i=1;
		while(i<=10) {
			System.out.println(n +" x " + i +" = "+ (n*i));
			i++;
			
		}
		
	}
	//factorial
	public static void findFactorial() {
		int i=1;
		int fact=1;
		while(i<=5) {       //1<=6 2<=6 
		fact=fact*i;        //1*1   1*2
		i++;                //  1+1=2 2+1=3
		}
		System.out.println(fact);
	}
	

	public static void main(String[] args) {
		
		print4Divisibles(50);
		//printEvenNumbers();
		//printMultiplicationTable(3);
		//findFactorial();
		

	}

}
