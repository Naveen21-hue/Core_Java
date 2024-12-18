package controlstatements;
//print square shape

public class Patterns {
	public static void printSquare() {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();

			
		}
	}
	//print right triangle
	public static void printRightTriangle() {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();

			
		}
	}
	
	//prit left triangle
	public static void printLeftTriangle() {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int k=i;k<=n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();

			
		}
	}
	
	//print bottom rightdown triangle
	public static void printRightdownTriangle() {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();

			
		}
	}
	//decreasing left downwordtriangle 
	public static void printleftdownTriangle() {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<i;k++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();

			
		}
	}
	//print pyramid
	public static void printpyramid() {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();

			
		}
	}
	//print reverse pyramid
		public static void printReversepyramid() {
			int n=4;
			for(int i=1;i<=n;i++) {
				for(int k=1;k<=i;k++) {
					System.out.print(" ");
				}
				for(int j=i;j<=n;j++) {
					System.out.print("* ");
				}
				System.out.println();

				
			}
		}
		
	
			
			
		
	
	
	
	

	public static void main(String[] args) {
		//printSquare();
		//printRightTriangle();
		//printLeftTriangle();
		//printRightdownTriangle();
		//printleftdownTriangle();
		//printpyramid();
		printReversepyramid() ;
		
	}

}
