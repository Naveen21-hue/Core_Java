package controlstatements;

public class AmstrongNumbers {
	public static void printAmstrongNumbers(int n) {
		
		int sum=0;
		int temp=n;
		int r=1;
		while(n>=1) {
			
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;

		}
		if(temp==sum) {
			System.out.print(temp+" its armstrongnumber");
		}
		else {
			System.out.print(temp+" not an armstrongnumber");
			
		}
	
		
	}
	


	public static void main(String[] args) {
		printAmstrongNumbers(37);
		

	}

}
