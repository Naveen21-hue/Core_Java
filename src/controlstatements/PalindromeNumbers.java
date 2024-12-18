package controlstatements;

public class PalindromeNumbers {
	public static void printPalindrome(int n) {
		int sum=0;
		int temp=n;
		int rem=1;
		while(n>=1) {
			rem=n%10;        // 313%10
			sum=sum*10+rem;
			n=n/10;
		
		}
		if(temp==sum) {
			System.out.println(temp+" is palindrome");	
	}
		else {
			System.out.println(temp+" is not palindrome");
			
		}
	}
	
			
	

	public static void main(String[] args) {
		printPalindrome(313);
		

	}

}
