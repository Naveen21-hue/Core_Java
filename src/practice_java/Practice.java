package practice_java;

public class Practice {
	private static int n;

	//PRIME NUMBERS OR NOT
	public static void printPrimeNumbers(int n) {
		int i=1;
		int factor=0;
		while(i<=n) {
			if(n%i==0) {
				factor++;
			}
			i++;
		}
		if(factor==2) {
			System.out.println(n+" its an prime number");
		}else {
			System.out.println(n+" its not an prime number");
		}
	}
	//Palindrome numbers
	public static void printPalindromes(int n) {
		int sum=0;
		int rem=0;
		int temp=n;
		
		while(n>=1) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;		
		}
		if(temp==sum) {
			System.out.println(temp+" its palindrome number");
		}
		else {
			System.out.println(temp+" its not an palindrome number");
		}
		
	}
	//armstrong numbers
	
	public static void printArmstrongNumber(int n) {
		int sum=0;
		int t=n;
		int r=0;
		while(n>=1) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(t==sum) {
			System.out.println(t+" its an armstrong number");
		}else {
			System.out.println(t+" its not an armstrong number");
		}
	}
	//fabpnacci series
	public static void printFabonacci(int n) {
		int firstterm=0,secondterm=1;
		System.out.print(firstterm+" "+secondterm);
		int i=1;
		while(i<=n) {
			int nextterm=firstterm+secondterm;
			System.out.print(" "+nextterm);
			firstterm=secondterm;
			secondterm=nextterm;
			i++;	
		}
		
	}

	public static void main(String[] args) {
		//printPrimeNumbers(13);
		//printPalindromes(121);
		//printArmstrongNumber(153);
		printFabonacci(15);
	}

}
