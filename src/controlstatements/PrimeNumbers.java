package controlstatements;
public class PrimeNumbers {
	public static void printPrimeNumbers(int n) {
		int factor=0;
		int i=1;

		while(i<=n) {
			if(n%i==0) {
				factor++;//1
           }
			i++;
		}
		if(factor==2) {
			System.out.print(n+" prime number");
		}
		else {
			System.out.print(n+" not a prime number");
		}
	}
		
	public static void main(String[] args) {
		printPrimeNumbers(13);
		

	}

}
