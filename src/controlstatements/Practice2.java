package controlstatements;

public class Practice2 {
	//Right traingle shape
	public static void PrintTraingle() {
		int n=5;
		for(int i=1;i<=n;i++) {
			
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//left triangle shape
	public static void PrintLeftTraingle() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int k=i;k<n;k++) {    //1<=5
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	//decreasing downwordtriangle //decrease space in
	public static void PrintTraingleDecreasing() {
		int n=5;
		for(int i=1;i<=n;i++) {  //1<=5
			
			for (int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//decreasing downwordtriangle   //increase space and increase star
	public static void PrintTraingleIncrease() {
		int n=5;
		for(int i=1;i<=n;i++) {  
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			
			for (int j=i;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//piramid
	public static void PrintPiramid() {
		int n=5;
		for(int i=1;i<=n;i++) {  
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//reverse priramid
	public static void PrintReversePiramid() {
		int n=5;
		for(int i=1;i<=n;i++) {  
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			
			for (int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//HILL Pattern
	public static void PrintHillPattern() {
		int n=5;
		for(int i=1;i<=n;i++) {  
			for(int k=i;k<=n;k++) {
				System.out.print("  ");
			}
			
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for (int m=1;m<=i;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//reverse Hill pattern
	public static void PrintReverseHillPattern() {
		int n=5;
		for(int i=1;i<=n;i++) {  
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			
			for (int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			for (int m=i;m<=n;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//daimomd
	public static void PrintDaimondPattern() {
		int n=5;
		for(int i=1;i<n;i++) {  
			for(int k=i;k<=n;k++) {
				System.out.print("  ");
			}
			
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for (int m=1;m<=i;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	for(int i=1;i<=n;i++) {  
		for(int k=1;k<=i;k++) {
			System.out.print("  ");
		}
		
		for (int j=i;j<=n;j++) {
			System.out.print("* ");
		}
		for (int m=i;m<=n;m++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	//pascal triangle
	public static void PrintPascalTriangle() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");	
			}
			
			System.out.println();	
		}
		for(int k=1;k<=n-1;k++) {
			for(int m=k;m<=n-1;m++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
	}
	
	//pascal triangle
	//public static void PrintPascalTriangle2() {
		
	

	public static void main(String[] args) {
		PrintTraingle();
		//PrintLeftTraingle();
		//PrintTraingleDecreasing();
		//PrintTraingleIncrease();
		//PrintPiramid() ;
		//PrintReversePiramid();
		//PrintHillPattern();
		//PrintReverseHillPattern();
		//PrintDaimondPattern();
		//PrintPascalTriangle();
		//PrintPascalTriangle2();
		

	}

}
