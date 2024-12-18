package interview_programes;

public class practice_programes {
	public static void printPrimeNumber(int n) {
		int factor=0;
		int i=1;
		
		while(i<=n) {
			if(n%i==0) {
				factor++;	
			}
			i++;
		}
		if(factor==2) {
			System.out.println(n+" its an prime number");
		}else {
			System.out.println(n+" its not  an prime number");

		}
		
		
	}
	//amstrong numbers
	public static void printArmstrongNumbers(int n) {
		int sum=0;
		int temp=n;
		int rem=1;
		
		while(n>=1) {
			
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;	
		}
		if(temp==sum) {
			System.out.println( "its an armstrong number :"+temp);
		}else {
			System.out.println( "its not an armstrong number: "+temp);

			
		}
		
	}
	
	//palindrome number
	public static void printPalindromeNumber(int n) {
		int sum=0;
		int temp=n;
		int rem=1;
		
		while(n>=1) {
			
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;	
		}
		if(temp==sum) {
			System.out.println("its palindrome number:"+temp);
			
		}else {
			System.out.println("its not  palindrome number:"+temp);

		}
	}
	     //factorials
	  public static void printfactorial() {
		  int i=1;
		  int fact=1;
		  while(i<=5) {
			  fact=fact*i;
			  i++;
		  }
		  System.out.println("5 factorial is:"+fact);
	  }
	  
	  //reverse the number
	  public static void printReverseNumber() {
		  int n=12345;
		  int sum=0;
		  int rev=0;
		  while(n>0) {
			  rev=n%10;
			  sum=sum*10+rev;
			  n=n/10;
			  
		  }
		  System.out.println("reverse number:"+sum);
	  }
	  //Armstrong numbers print 1 to 1000
	  public static void printArmstongNumbers() {
		  
		  for(int i=1;i<=1000;i++) {     //using for loop
			  
			  int rem;                   //reminder
			  int n=i;                   //store the varible into another
			  int sum=0;                 
			  
			  while(n>0) {                         
				  
				  rem=n%10;               //1%10       
				  sum=sum+(rem*rem*rem);  
				  n=n/10;                 
			  }
			  if(sum==i) {
				  System.out.print(i+" ");
				  
			  }
			 
			  
		  }
	  }
	  
	

	  
	  //Palindrome numbers print 1 to 100
	  public static void printPlindromeNumbers() {
		  
		  for(int i=1;i<=100;i++) {
			  int rem;
			  int n=i;
			  int sum=0;
			  
			  while(n>0) {
				  
				  rem=n%10;
				  sum=(sum*10)+rem;
				  n=n/10;
			  }
			  if(sum==i) {
				 
				  System.out.println(i+",");
			  }
			    
		  }
		  
	  }
	  //count of the given number
	  public static void printCountOfNumber() {
		 
			  int n=12345;	
			  int i=0;
			  while(n>0) {   
				  n=n/10; 
				  i++;
				 
			  }
			  System.out.println("no of digits:"+i);  
		  }
	  //sum of natural numbers
	  public static void naturalNumbers() {
		  int i=1;
		  int sum=0;
		  while(i<=5) {
			  sum=sum+i;
			  i++;
		  }
		  System.out.println(sum);
	  }
	  
	  //swapping the numbers using third variable
	  public static void swapNumbers() {
		  int a=15,b=10,c = 0;
		   System.out.println("before swapping a:"+a+" b:"+b );
		   
		   c=a;
		   a=b;
		   b=c;
		  		   
		   System.out.println("after swapping a:"+a+" b:"+b);
	  }
	  
	  //Swap of two variable without using third variable
	  public static void swapingNumbers() {
		  int a=20,b=10;
		  System.out.println("before swapping a:"+a+" b:"+b );

		  a=a+b;  //30
		  b=a-b;  //20
		  a=a-b;  //10
		  System.out.println("after swapping a:"+a+" b:"+b);  
	  }
	  
	  //find evan or odd
	 public static void evenOrOdd() {
		 int i=10;
		 if(i%2==0) {
			 System.out.println("even number");
		 }else {
			 System.out.println("odd number");
			 
		 }
	 }
	 
	 //print the even numbers 1to10
	 public static void evenNumbers() {
		 int i=1;
		 
		 while(i<=10) {
			 if(i%2==0) {
				 
				 System.out.print(i+",");
			 }
			 i++;

		 }
	 }
	 
	 //count of even and odd
	 
	 public static void countOfEvenOdd() {
		 int a=0,b=0;
		 for(int i=1;i<=100;i++) {
			 if(i%2==0) {
				 a++; 
			 }else {
				 b++;
			 }
		 }
		 System.out.println("even cout is:" +a+ ",odd count is:"+b);
		 
	 }
	 
	 //fabonacci series numbers
	 public static void fabonacciSeries() {
		 int a=0,b=1;
		 System.out.print(a+" " +b);
		 
		 for(int i=2;i<=10;i++) {
			 int c=a+b;
	    System.out.print(" "+c);
			 
			 a=b;
			 b=c;
			 
		 }
		 
	 }
	 //fabonacci series numbers 1 t0 100
	 public static void fabonacciseries1() {
		 int a=0,b=1;
		 System.out.print(+a+" "+b);
		 for(int i=1;i<=10;i++) {
			 int c=a+b;
			 if(c<=100) {
				 a=b;
				 b=c;
				 System.out.print(" "+c);

				 
			 }
			 
		 }
	 }
 
	 
	  
	  
	  
	  
	  
	 	  
		  
		  		 

	public static void main(String[] args) {
		// printPrimeNumber(6) ;
		// printArmstrongNumbers(153);
		// printPalindromeNumber(121);
		// printfactorial();	
		// printReverseNumber();
		 //printArmstongNumbers();
		 //printPlindromeNumbers();
		// printCountOfNumber();
		// naturalNumbers();
		 //swapNumbers();
		// swapingNumbers();
		// evenOrOdd();
		// evenNumbers();
		// countOfEvenOdd();
		// fabonacciSeries() ;
		 fabonacciseries1(); 
		
	}
}
