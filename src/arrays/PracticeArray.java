package arrays;

public class PracticeArray {
	//Even Numbers
	public static void printEvenumbers() {
		//datatype[] arrayname={value1,value2,...};
		int[] a= {1,2,3,4,5,6,8,10};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}		
	}
	//odd numbers using array
	public static void printOddNumbers() {
		//datatype[] arrayname={value1,value2,...};
		int[] a= {1,2,3,7,5,6,8,10};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}
	//prime numbers using array
	public static void printPrimeNumbers() {
		int[] a= {1,2,3,4,5,6,7,9};
		int factor=0;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a[i];j++) {
				if(a[i]%j==0){
					factor++;
					
				}
			}
			if(factor==2) {
				System.out.println(a[i]+" prime number");
			}
			else {
				System.out.println(a[i]+"not prime number");
			}
		}
		
	}
	//armstrong method using array
	public static void PrintArmstromgNumbers( int n) {
		int[] a = { 153, 9474, 1634, 371, 9475 };
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			int sum=0;
			int r=0;
			int temp=num;
			while(num>=1) {
				r=num%10;
				sum=sum+r*r*r;
				num=num/10;
				a[i]=temp;

				
			}
			if(a[i]==sum) {
				System.out.println(a[i]+ " its armstrongnumber");
			}
			else {
				System.out.println(a[i]+" not an armstrongnumber");
				
			}
		
			
			
		}

		
			
			

		
		
	}
		
	public static void main(String[] args) {
		//printEvenumbers();
		//printOddNumbers();
		 printPrimeNumbers();
		// PrintArmstromgNumbers(0);
		

	}

}
